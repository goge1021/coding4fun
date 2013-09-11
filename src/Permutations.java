import java.util.ArrayList;

public class Permutations {

	public ArrayList<ArrayList<Integer>> ret;
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
		ret = new ArrayList<ArrayList<Integer>>();
		if(num == null || num.length == 0){
			return ret;
		}
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int n : num){
			nums.add(n);
		}
		foo(new ArrayList<Integer>(), nums);
		return ret;
	}
	private void foo(ArrayList<Integer> path, ArrayList<Integer> left) {
		if(left.size() == 0){
			ret.add(path);
		}
		for(int i=0; i<left.size(); i++){
			int n = left.get(i);
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
		Permutations p = new Permutations();
		System.out.println(p.permute(new int[]{1,1,2}));
	}

}
