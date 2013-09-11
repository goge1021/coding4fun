import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class CombinationSum2 {

	public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
		Arrays.sort(num);
		ArrayList<ArrayList<ArrayList<Integer>>> values = new ArrayList<ArrayList<ArrayList<Integer>>>();
		ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();
		tmp.add(new ArrayList<Integer>());
		values.add(tmp);
		for(int j=1; j<=target; j++){
			values.add(null);
		}
		for(int c : num){
			for(int v=target; v>=c; v--){
				if(values.get(v-c) != null){
					ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
					for(ArrayList<Integer> t : values.get(v-c)){
						ArrayList<Integer> tt = new ArrayList<Integer>(t);
						tt.add(c);
						temp.add(tt);
					}
					
					if(values.get(v) == null){
						values.set(v, temp);
					} else {
						values.get(v).addAll(temp);
					}
				}
			}
		}
		Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		if(values.get(target) == null){
			return new ArrayList<ArrayList<Integer>>();
		} else {
			set.addAll(values.get(target));
			return new ArrayList<ArrayList<Integer>>(set);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CombinationSum2 c = new CombinationSum2();
		System.out.println(c.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
	}

}
