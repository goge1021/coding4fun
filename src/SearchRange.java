
public class SearchRange {

	public int search(int[] A, int target){
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
		return -1;
	}
	
	public int[] searchRange(int[] A, int target) {
        int pos = search(A, target);
        if(pos == -1){
        	return new int[]{-1, -1};
        } else {
        	int start, end;
        	for(end=pos; end<A.length && A[end] == target; end++);
        	for(start=pos; start>=0 && A[start] == target; start--);
        	return new int[]{start+1, end-1};
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SearchRange s = new SearchRange();
		int[] ret = s.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
		for(int i : ret)
			System.out.println(i);
	}

}
