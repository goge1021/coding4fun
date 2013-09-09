import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class ThreeSum {

	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		Arrays.sort(num);
		Integer pre = null;
		Set<ArrayList<Integer>> ret = new HashSet<ArrayList<Integer>>();
		for(int i=0; i<num.length; i++){
			if(pre != null && num[i] == pre)
				continue;
			ArrayList<ArrayList<Integer>> r = twoSum(num, -num[i], i);
			if(r != null){
				for(ArrayList<Integer> t : r){
					t.add(num[i]);
					Collections.sort(t);
				}
				ret.addAll(r);
			}
			pre = num[i];
		}
		return new ArrayList<ArrayList<Integer>>(ret);
	}
	private ArrayList<ArrayList<Integer>> twoSum(int[] num, int target, int except) {
		int min = 0;
        int max = num.length-1;
        ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
        if(min == except)
        	min++;
        if(max == except)
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
        		while((num[min] == minPre || min == except) && min < max)
        			min++;
        		while((num[max] == maxPre || max == except) && min < max)
        			max--;
        	} else if(num[min] + num[max] < target){
        		while((num[min] == minPre || min == except) && min < max)
        			min++;
        	} else {
        		while((num[max] == maxPre || max == except) && min < max)
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
		ThreeSum t = new ThreeSum();
		System.out.println(t.threeSum(new int[]{-1,0, 1, 2, -1, -4}));
	}

}
