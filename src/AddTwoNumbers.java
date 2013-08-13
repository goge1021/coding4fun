
public class AddTwoNumbers {

	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode head = null;
        ListNode cur = null;
        ListNode newNode = null;
        int jin = 0;
        while(l1 != null || l2!=null){
        	int sum = (l1 == null? 0 : l1.val) + (l2 == null? 0 : l2.val) + jin;
        	jin = sum/10;
        	sum %= 10;
        	newNode = new ListNode(sum);
        	if(head == null){
        		head = newNode;
        		cur = newNode;
        	} else {
        		cur.next = newNode;
        		cur = cur.next;
        	}
        	if(l1 != null)
        		l1 = l1.next;
        	if(l2 != null)
        		l2 = l2.next;
        }
        
    	if(jin == 1){
    		ListNode end = new ListNode(1);
    		cur.next = end;
    	} 
        
        return head;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
