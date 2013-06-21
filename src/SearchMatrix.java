
public class SearchMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		if(m == 0){
			return false;
		}
		int n = matrix[0].length;
		int min = 0;
		int max = m*n-1;
		int mid;
		while(max >= min){
			mid = (min+max)/2;
			if(matrix[mid/n][mid%n] == target){
				return true;
			} else if(matrix[mid/n][mid%n] > target){
				max = mid-1;
			} else {
				min = mid+1;
			}
		}
		return false;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
