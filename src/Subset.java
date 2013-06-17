import java.util.ArrayList;
import java.util.Arrays;


public class Subset {

	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
		if(S == null){
			return null;
		}
		Arrays.sort(S);
		long total = (long)Math.pow(2, S.length);
		long tmp;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(long i=0; i<total; i++){
			tmp = i;
			ArrayList<Integer> sub = new ArrayList<Integer>();
			for(int n=0; n<S.length; n++){
				if((tmp & 1) == 1){
					sub.add(S[n]);
				}
				tmp = tmp >>> 1;
			}
			list.add(sub);
		}
		return list;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subset s = new Subset();
		int[] S = {5,3,7,6,2};
		System.out.println(s.subsets(S));
	}

}
