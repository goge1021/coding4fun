
public class MergeTwoSortedLists {

	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null, cur = null;
        ListNode min;
        if(l1 == null && l2 == null){
            return null;
        } else {
            while(l1 != null || l2 != null){
                if(l1 != null && l2 == null){
                    min = l1;
                    l1 = l1.next;
                } else if(l1 == null && l2 != null){
                    min = l2;
                    l2 = l2.next;
                } else {
                    if(l1.val < l2.val){
                        min = l1;
                        l1 = l1.next;
                    } else {
                        min = l2;
                        l2 = l2.next;
                    }
                }
                if(head == null){
                    head = cur = min;
                } else {
                    cur.next = min;
                    cur = min;
                }
            }
            return head;
        }
    }
}
