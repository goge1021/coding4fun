import java.util.ArrayList;


public class PascalTriangle {
	public int C(int x, int y){
        long up = 1;
        long down = 1;
        for(int i=0; i<y; i++){
            up *= (x-i);
            down *= (i+1);
        }
        return (int)(up/down);
    }
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<numRows; i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j=0; j<=i/2; j++){
                list.add(C(i, j));
            }
            for(int m=i-i/2; m>0; m--){
                list.add(list.get(m-1));
            }
            triangle.add(list);
        }
        return triangle;
    }
}
