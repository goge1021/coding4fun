import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class LengthOfLongestSubstring {
	public int lengthOfLongestSubstring(String s){
//		char c;
		Character c, head;
		Set<Character> set = new HashSet<Character>();
		Queue<Character> queue = new LinkedList<Character>();
		int len = 0;
		int max = 0;
		for(int i=0; i<s.length(); i++){
			c = s.charAt(i);
			if(!set.contains(c)){
				set.add(c);
				queue.offer(c);
				len++;
				max = max < len ? len : max;
			} else {
				head = queue.poll();
				while(head != null && head != c){
					set.remove(head);
					head = queue.poll();
					len--;
				}
				queue.offer(c);
			}
		}
		return max;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LengthOfLongestSubstring l = new LengthOfLongestSubstring();
		System.out.println(l.lengthOfLongestSubstring("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"));

	}

}
