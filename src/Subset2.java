import java.util.ArrayList;
import java.util.Arrays;


public class Subset2 {
	
	private int[] S;
	private ArrayList<ArrayList<Integer>> ret;
	
	@SuppressWarnings("unchecked")
	public void foo(int pos, ArrayList<Integer> sub, int preNum, boolean putInList){
		if(pos == 0){
			ArrayList<Integer> sub1 = new ArrayList<Integer>();
			ArrayList<Integer> sub2 = new ArrayList<Integer>();
			sub1.add(S[0]);
			foo(1, sub1, S[0], true);
			foo(1, sub2, S[0], false);
		} else if(pos == S.length){
			ret.add(sub);
		} else {
			if(preNum == S[pos] && putInList == false){
				foo(pos+1, sub, S[pos], false);
			} else {
				ArrayList<Integer> subClone = (ArrayList<Integer>) sub.clone();
				sub.add(S[pos]);
				foo(pos+1, sub, S[pos], true);
				foo(pos+1, subClone, S[pos], false);
			}
		}
	}
	
	public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
		if(num == null){
			return null;
		}
		Arrays.sort(num);
		S = num;
		ret  = new ArrayList<ArrayList<Integer>>();
		
		foo(0, null, 0, false);
		
		return ret;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subset2 s = new Subset2();
		int[] S = {1,2,2};
		ArrayList<ArrayList<Integer>> list = s.subsetsWithDup(S);
		System.out.println(list);
	}

}
