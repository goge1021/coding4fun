import java.util.Arrays;


public class TwoSum {

	public class Num implements Comparable<Num>{
		public int num;
		public int index;
		
		@Override
		public int compareTo(Num o) {
			return this.num-o.num;
		}
		
		public Num(int num, int index){
			this.num = num;
			this.index = index;
		}
		
	}
	
	public int[] twoSum(int[] numbers, int target) {
		Num[] nums = new Num[numbers.length];
		for(int i=0; i<numbers.length; i++){
			Num num = new Num(numbers[i], i+1);
			nums[i] = num;
		}
        Arrays.sort(nums);
        int min = 0;
        int max = nums.length-1;
        while(min < max){
            if(nums[min].num+nums[max].num == target){
                return new int[]{Math.min(nums[min].index, nums[max].index), Math.max(nums[min].index, nums[max].index)};
            } else if(nums[min].num+nums[max].num > target){
                max--;
            } else {
                min++;
            }
        }
        return null;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		int[] ret = t.twoSum(new int[]{150,24,79,50,88,345,3}, 200);
		System.out.println(ret[0] +"     " + ret[1]);
	}

}
