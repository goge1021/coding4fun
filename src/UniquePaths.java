
public class UniquePaths {

	public int uniquePaths(int m, int n) {
        if(m == 0 || n == 0){
            return 0;
        }
        int[][] ret = new int[m][n];
        int up,left;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == 0 && j == 0){
                    ret[0][0] = 1;
                    continue;
                }
                up = (i-1)>=0 ? ret[i-1][j] : 0;
                left = (j-1)>=0 ? ret[i][j-1] : 0;
                ret[i][j] = up+left;
            }
        }
        return ret[m-1][n-1];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
