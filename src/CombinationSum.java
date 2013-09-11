import java.util.ArrayList;
import java.util.Arrays;


public class CombinationSum {

	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		ArrayList<ArrayList<ArrayList<Integer>>> values = new ArrayList<ArrayList<ArrayList<Integer>>>();
		values.add(new ArrayList<ArrayList<Integer>>());
		for(int i=1; i<=target; i++){
			values.add(null);
		}
		for(int c : candidates){
			for(int v=c; v<=target; v++){
				if(values.get(v-c) != null){
					ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();
					for(ArrayList<Integer> list : values.get(v-c)){
						tmp.add(new ArrayList<Integer>(list));
					}
					if(tmp.size() == 0){
						tmp.add(new ArrayList<Integer>());
					}
					for(ArrayList<Integer> t : tmp){
						t.add(c);
					}
					if(values.get(v) != null){
						values.get(v).addAll(tmp);
					} else {
						values.set(v, tmp);
					}
				}
			}
		}
		return values.get(target)==null? new ArrayList<ArrayList<Integer>>() : values.get(target);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CombinationSum c = new CombinationSum();
		System.out.println(c.combinationSum(new int[]{2,3,6,7}, 7));

	}

}
