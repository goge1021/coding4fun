
public class MinPathSum {

	public int minPathSum(int[][] grid) {
        int rowLen = grid.length;
        if(rowLen == 0){
            return 0;
        }
        int colLen = grid[0].length;
        int up;
        int left;
        int[][] ret = new int[rowLen][colLen];
        for(int i=0; i<rowLen; i++){
            for(int j=0; j<colLen; j++){
            	if(i == 0 && j == 0){
            		ret[0][0] = grid[0][0];
            		continue;
            	}
                up = (i-1) >= 0 ? ret[i-1][j] : Integer.MAX_VALUE;
                left = (j-1) >= 0 ? ret[i][j-1] : Integer.MAX_VALUE;
                ret[i][j] = grid[i][j] + Math.min(up, left);
            }
        }
        return ret[rowLen-1][colLen-1];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MinPathSum m = new MinPathSum();
		System.out.println(m.minPathSum(new int[][]{{1,2},{1,1}}));
	}

}
