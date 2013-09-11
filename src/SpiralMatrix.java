import java.util.ArrayList;


public class SpiralMatrix {

	public ArrayList<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		if(matrix == null || matrix.length == 0){
			return ret;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		int x=0, y=0;
		while(m >= 2 && n >= 2){
			for(int i=0; i<n; i++){
				ret.add(matrix[x][y+i]);
			}
			for(int i=1; i<m; i++){
				ret.add(matrix[x+i][y+n-1]);
			}
			for(int i=1; i<n; i++){
				ret.add(matrix[x+m-1][y+n-1-i]);
			}
			for(int i=1; i<m-1; i++){
				ret.add(matrix[x+m-1-i][y]);
			}
			x++;
			y++;
			m -= 2;
			n -= 2;
		}
		if(m == 1 && n > 0){
			for(int i=0; i<n; i++){
				ret.add(matrix[x][y+i]);
			}
		} else if(m > 0 && n == 1){
			for(int i=0; i<m; i++){
				ret.add(matrix[x+i][y+n-1]);
			}
		}
		return ret;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
