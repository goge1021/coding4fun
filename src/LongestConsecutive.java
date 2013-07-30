import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class LongestConsecutive {

	public int longestConsecutive(int[] num) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<num.length; i++){
			set.add(num[i]);
		}
		int max = 0;
		for(int i=0; i<num.length; i++){
			if(set.contains(num[i])){
				max = Math.max(max, getCount(set, num[i], -1) + getCount(set, num[i]+1, 1));
			}
		}
		return max;
	}
	private int getCount(Set<Integer> set, int val, int step) {
		int count = 0;
		while(set.contains(val)){
			set.remove(val);
			count++;
			val += step;
		}
		return count;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
