import java.util.ArrayList;


public class Combinations {

	public void foo(ArrayList<Integer> path, int start, int end, int left){
        if(left == 0){
            ret.add(path);
        } else {
            for(int i=start; i<=end-left+1; i++){
                ArrayList<Integer> newPath = new ArrayList<Integer>(path);
                newPath.add(i);
                foo(newPath, i+1, end, left-1);
            }
        }
    }
    
    ArrayList<ArrayList<Integer>> ret;
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ret = new ArrayList<ArrayList<Integer>>();
        foo(new ArrayList<Integer>(), 1, n, k);
        return ret;
    }
}
