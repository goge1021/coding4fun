import java.util.ArrayList;


public class MergeKLists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	public ListNode mergeKLists(ArrayList<ListNode> lists) {
		ArrayList<ListNode> curPoints = new ArrayList<ListNode>();
		for(ListNode node : lists){
			if(node != null){
				curPoints.add(node);
			}
		}
		int mark = 0;
		ListNode min=null, head=null, cur=null; 
		while(curPoints.size() != 0){
			min = null;
			for(int i=0; i<curPoints.size(); i++){
				if(min == null){
					min = curPoints.get(i);
					mark = i;
				} else {
					if(min.val > curPoints.get(i).val){
						min = curPoints.get(i);
						mark = i;
					}
				}
			}
			if(cur == null){
				head = cur = min;
			} else {
				cur.next = min;
				cur = cur.next;
			}
			if(min.next == null){
				curPoints.remove(mark);
			} else {
				curPoints.set(mark, min.next);
			}
		}
		return head;
    }
}
