
public class RemoveDuplicatesFromSortedList {

	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
	
	public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
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
}
