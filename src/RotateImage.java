
public class RotateImage {

	public void rotate(int[][] matrix) {
        if(matrix == null || matrix[0].length == 0){
            return;
        }
        int tmp;
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        int head=0,tail=matrix.length-1;
        while(head < tail){
            for(int i=0; i<matrix.length; i++){
                tmp = matrix[i][head];
                matrix[i][head] = matrix[i][tail];
                matrix[i][tail] = tmp;
            }
            head++;
            tail--;
        }
    }
}
