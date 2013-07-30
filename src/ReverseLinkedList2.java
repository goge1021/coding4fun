
public class ReverseLinkedList2 {
	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	    
	    public String toString(){
	    	StringBuilder sb = new StringBuilder();
	    	ListNode cur = this;
	    	while(cur != null){
	    		sb.append(cur.val).append("->");
	    		cur = cur.next;
	    	}
	    	return sb.append("NULL").toString();
	    }
	}
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if(m > n || m <= 0 || n <= 0){
			return null; 
		} else if(m == n){
			return head;
		} else {
			ListNode cur = head;
			ListNode pre = null;
			ListNode next = null;
			ListNode part1 = null;
			ListNode part2 = null;
			ListNode reverseHead = null;
			ListNode reverseTail = null;
			int pos = 1;
			
			while(cur != null){
				if(pos == m-1){
					part1 = cur;
					cur = cur.next;
				} else if(pos == m){
					pre = reverseHead = cur;
					cur = cur.next;
				} else if(pos > m && pos < n){
					next = cur.next;
					cur.next = pre;
					pre = cur;
					cur = next;
				} else if(pos == n){
					next = cur.next;
					cur.next = pre;
					reverseTail = pre = cur;
					cur = next;
				} else if(pos == n+1){
					part2 = cur;
					cur = null;
				} else {
					cur = cur.next;
				}
				pos++;
			}
			if(reverseHead == null || reverseTail == null){
				return null;
			} else {
				if(part1 == null){
					head = reverseTail;
				} else {
					part1.next = reverseTail;
				}
				if(part2 == null){
					reverseHead.next = null;
				} else {
					reverseHead.next = part2;
				}
			}
		}
		return head;
    }
	
	public static void main(String args[]){
		ReverseLinkedList2 r = new ReverseLinkedList2();
		ListNode head = new ListNode(1);
		ListNode pre = head;
		for(int i=0; i<4; i++){
			ListNode cur = new ListNode(i+2);
			pre.next = cur;
			pre = pre.next;
		}
		System.out.println(head.toString());
		head = r.reverseBetween(head, 3, 4);
		System.out.println(head.toString());
	}
}
