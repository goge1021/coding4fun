
public class RemoveDuplicatesFromSortedList2 {
	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	    
	    public String toString(){
	    	ListNode cur =this;
	    	StringBuilder sb = new StringBuilder();
	    	while(cur != null){
	    		sb.append(cur.val).append("->");
	    		cur = cur.next;
	    	}
	    	return sb.append("NULL").toString();
	    }
	}
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null){
    		return null;
		} else {
			ListNode cur = head.next;
			ListNode pre = head;
			ListNode prePre = null;
			int preVal = head.val;
			while(cur != null){
				if(cur.val != preVal){
					prePre = pre;
					if(pre == null){
						head = cur;
					} else {
						pre.next = cur;
					}
					pre = cur;
					preVal = cur.val;
				} else {
					pre = prePre;
				}
				cur = cur.next;
			}
            if(pre != null){
    			pre.next = null;
            } else {
                return null;
            }
		}
		return head;
	}
	
	public static void main(String[] args){
		ListNode root = new ListNode(1);
		ListNode n1 = new ListNode(1);
		root.next = n1;
		RemoveDuplicatesFromSortedList2 r = new RemoveDuplicatesFromSortedList2();
		ListNode head = r.deleteDuplicates(root);
		System.out.println(head.toString());
	}
}
