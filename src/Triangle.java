import java.util.ArrayList;


public class Triangle {

	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int n = triangle.size();
        int[] sum = new int[n];
        for(int i=0; i<n; i++){
        	sum[i] = triangle.get(n-1).get(i);
        }
        for(int i=n-2; i>=0; i--){
        	ArrayList<Integer> list = triangle.get(i);
        	for(int j=0; j<=i; j++){
        		sum[j] = list.get(j)+Math.min(sum[j], sum[j+1]);
        	}
        }
        return sum[0];
    }
}
