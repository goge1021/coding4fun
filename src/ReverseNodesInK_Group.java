
public class ReverseNodesInK_Group {

	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
	
	public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <=1){
            return head;
        } else {
            ListNode part1=null, part2=null;
            ListNode cur=head;
            
            ListNode headNode, midNode, tailNode;
            ListNode tmp;
            
            int count = 1;
            while(cur != null){
                cur = cur.next;
                
                if(count % k == 0){
                    part2 = cur;
                    headNode = null;
                    if(part1 == null){
                        midNode = head;
                    } else {
                        midNode = part1.next;
                    }
                    tmp = midNode;
                    tailNode = midNode.next;
                    
                    while(tailNode != part2){
                        midNode.next = headNode;
                        headNode = midNode;
                        midNode = tailNode;
                        tailNode = tailNode.next;
                    }
                    midNode.next = headNode;
                    if(part1 == null){
                        head = midNode;
                    } else {
                        part1.next = midNode;
                    }
                    tmp.next = part2;
                    part1 = tmp;
                }
                count++;
            }
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
