import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class Permutations2 {

	public Set<ArrayList<Integer>> set;
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
		set = new HashSet<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		if(num == null || num.length == 0){
			return ret;
		}
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Collections.sort(nums);
		for(int n : num){
			nums.add(n);
		}
		foo(new ArrayList<Integer>(), nums);
		ret.addAll(set);
		return ret;
	}
	private void foo(ArrayList<Integer> path, ArrayList<Integer> left) {
		if(left.size() == 0){
			set.add(path);
		}
		for(int i=0; i<left.size(); i++){
			int n = left.get(i);
			if(i>0 && left.get(i) == left.get(i-1)){
                continue;
            }
			ArrayList<Integer> tmpPath = new ArrayList<Integer>(path);
			ArrayList<Integer> tmpLeft = new ArrayList<Integer>(left);
			tmpLeft.remove(i);
			tmpPath.add(n);
			foo(tmpPath, tmpLeft);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
