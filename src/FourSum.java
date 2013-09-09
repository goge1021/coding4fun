import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class FourSum {

	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		Arrays.sort(num);
		Integer pre1 = null, pre2 = null;
		Set<ArrayList<Integer>> ret = new HashSet<ArrayList<Integer>>();
		for(int i=0; i<num.length; i++){
			if(pre1 != null && num[i] == pre1)
				continue;
			pre2 = null;
			for(int j=i+1; j<num.length; j++){
				if(pre2 != null && num[j] == pre2)
					continue;
				ArrayList<ArrayList<Integer>> r = twoSum(num, target-num[i]-num[j], i, j);
				if(r != null){
					for(ArrayList<Integer> t : r){
						t.add(num[i]);
						t.add(num[j]);
						Collections.sort(t);
					}
					ret.addAll(r);
				}
				pre2 = num[j];
			}
			pre1 = num[i];
		}
		return new ArrayList<ArrayList<Integer>>(ret);
    }
	private ArrayList<ArrayList<Integer>> twoSum(int[] num, int target, int except1, int except2) {
		int min = 0;
        int max = num.length-1;
        ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
        while(min == except1 || min == except2)
        	min++;
        while(max == except1 || max == except2)
        	max--;
        int minPre, maxPre;
        while(min < max){
        	minPre = num[min];
        	maxPre = num[max];
        	if(num[min] + num[max] == target){
        		ArrayList<Integer> tmp = new ArrayList<Integer>();
        		tmp.add(num[min]);
        		tmp.add(num[max]);
        		r.add(tmp);
        		while((num[min] == minPre || min == except1 || min == except2) && min < max)
        			min++;
        		while((num[max] == maxPre || max == except1 || max == except2) && min < max)
        			max--;
        	} else if(num[min] + num[max] < target){
        		while((num[min] == minPre || min == except1 || min == except2) && min < max)
        			min++;
        	} else {
        		while((num[max] == maxPre || max == except1 || max == except2) && min < max)
        			max--;
        	}
        }
        if(r.size() == 0)
        	return null;
        else 
        	return r;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FourSum f = new FourSum();
		System.out.println(f.fourSum(new int[]{-7,-5,0,7,1,1,-10,-2,7,7,-2,-6,0,-10,-5,7,-8,5}, 28));
	}

}
