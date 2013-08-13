import java.util.ArrayList;


public class GenerateParenthesis {

	public void foo(ArrayList<String> ret, String cur, int left, int right){
		if(left == 0 && right == 0){
			ret.add(cur);
		} else {
			if(left > 0 && right == 0){
				foo(ret, cur+"(", left-1, right+1);
			} else if(left == 0 && right > 0){
				foo(ret, cur+")", left, right-1);
			} else {
				foo(ret, cur+"(", left-1, right+1);
				foo(ret, cur+")", left, right-1);				
			}
		}
	}
	
	public ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> ret = new ArrayList<String>();
		foo(ret, "", n, 0);
		return ret;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenerateParenthesis g = new GenerateParenthesis();
		ArrayList<String> ret = g.generateParenthesis(7);
		System.out.println(ret);
	}

}
