import java.util.ArrayList;


public class PascalTriangle2 {
	public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int j=0; j<=rowIndex/2; j++){
            if(j == 0){
                list.add(1);
            } else {
                list.add((int)((long)list.get(j-1) * (rowIndex - j + 1) / j));
            }
        }
        for(int m=rowIndex-rowIndex/2; m>0; m--){
            list.add(list.get(m-1));
        }
        return list;
    }
}
