
public class SwapPairs {
	
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
	
	public ListNode swapPairs(ListNode head) {
		if(head == null){
			return null;
		} else {
			ListNode pre = head;
			ListNode cur = head.next;
			ListNode part1 = null;
			ListNode part2 = null;
			part2 = cur==null ? null : cur.next;
			while(cur != null){
				cur.next = pre;
				if(part1 == null) {
					head = cur;
				} else {
					part1.next = cur;
				}
				pre.next = part2==null ? null : part2;
				
				part1 = pre;
				pre = part2;
				cur = pre==null ? null : pre.next;
				part2 = cur==null ? null : cur.next;
			}
			
			return head;
		}
    }
	
	public static void main(String args[]){
		SwapPairs r = new SwapPairs();
		ListNode head = new ListNode(1);
		ListNode pre = head;
		for(int i=0; i<4; i++){
			ListNode cur = new ListNode(i+2);
			pre.next = cur;
			pre = pre.next;
		}
		System.out.println(head.toString());
		head = r.swapPairs(head);
		System.out.println(head.toString());
	}
}
