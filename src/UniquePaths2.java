
public class UniquePaths2 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] ret = new int[m][n];
        int up,left;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == 0 && j == 0){
                    ret[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
                    continue;
                }
                up = (i-1)>=0 ? ret[i-1][j] : 0;
                left = (j-1)>=0 ? ret[i][j-1] : 0;
                ret[i][j] = obstacleGrid[i][j] == 1 ? 0 : up+left;
            }
        }
        return ret[m-1][n-1];
    }
}
