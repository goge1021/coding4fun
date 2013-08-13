
public class RotateList {
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
	
	public ListNode rotateRight(ListNode head, int n) {
		if(head == null || n == 0){
			return head;
		}
		ListNode p = head;
		ListNode last = null;
		int len = 0;
		while(p != null){
			last = p;
			p = p.next;
			len++;
		}
		int rotate = n % len;
		if(rotate == 0){
			return head;
		} else {
			p = head;
			for(int i=0; i<(len-rotate-1); i++){
				p = p.next;
			}
			last.next = head;
			head = p.next;
			p.next = null;
			return head;
		}
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
