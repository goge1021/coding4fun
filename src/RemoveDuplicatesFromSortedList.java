
public class RemoveDuplicatesFromSortedList {

	public class ListNode {
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
            int preVal = head.val;
            while(cur != null){
                if(preVal != cur.val){
                    preVal = cur.val;
                    pre.next = cur;
                    pre = cur;
                }
                cur = cur.next;
            }
            pre.next = null;
        }
        
        return head;
    }
	
	public static void main(String[] args){
		
	}
}
