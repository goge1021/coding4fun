
public class SearchInsert {
	
	public int searchInsert(int[] A, int target) {
		int min=0, max=A.length-1;
		int mid;
		while(min <= max){
			mid = (min + max) / 2;
			if(A[mid] == target){
				return mid;
			} else if(A[mid] > target){
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
		return min;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SearchInsert s = new SearchInsert();
		System.out.println(s.searchInsert(new int[]{1,3,3,5,6}, 2));
	}

}
