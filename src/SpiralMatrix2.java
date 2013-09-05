
public class SpiralMatrix2 {

	public int[][] generateMatrix(int n) {
        if(n <= 0){
            return new int[0][0];
        } else {
            int[][] matrix = new int[n][n];
            int x=0,y=0;
            int num = 1;
    		while(n >= 1){
				for(int i=0; i<n; i++){
					matrix[y][x+i] = num++;
				}
				for(int i=0; i<n-1; i++){
					matrix[y+1+i][x+n-1] = num++;
				}
				for(int i=0; i<n-1; i++){
					matrix[y+n-1][x+n-2-i] = num++;
				}
				for(int i=0; i<n-2; i++){
				    matrix[y+n-2-i][x] = num++;
				}
				x++;
				y++;
				n -= 2;
			}
            return matrix;
        }
    }
}
