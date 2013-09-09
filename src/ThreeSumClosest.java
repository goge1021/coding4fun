import java.util.Arrays;


public class ThreeSumClosest {

	public int closest;
	public int sum;
	public int threeSumClosest(int[] num, int target) {
		closest = Integer.MAX_VALUE;
		Arrays.sort(num);
		Integer pre = null;
		for(int i=0; i<num.length; i++){
			if(pre == null){
				pre = num[i];
			} else {
				if(num[i] == pre)
					continue;
			}
			twoSum(num, target-num[i], i);
			pre = num[i];
		}
		return sum;
    }
	
	private void twoSum(int[] num, int target, int except) {
		int min = 0;
        int max = num.length-1;
        if(min == except)
        	min++;
        if(max == except)
        	max--;
        int minPre, maxPre;
        while(min < max){
        	minPre = num[min];
        	maxPre = num[max];
        	if(num[min] + num[max] == target){
        		closest = 0;
        		sum = target+num[except];
        		return;
        	} else if(num[min] + num[max] < target){
        		if((target-num[min]-num[max]) < closest){
        			closest = target-num[min]-num[max];
        			sum = num[min] + num[max] + num[except];
        		}
        		while((num[min] == minPre || min == except) && min < max)
        			min++;
        	} else {
        		if((num[min]+num[max]-target) < closest){
        			closest = num[min]+num[max]-target;
        			sum = num[min] + num[max] + num[except];
        		}
        		while((num[max] == maxPre || max == except) && min < max)
        			max--;
        	}
        }
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreeSumClosest t = new ThreeSumClosest();
		System.out.println(t.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
	}

}
