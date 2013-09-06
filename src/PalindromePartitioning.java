import java.util.ArrayList;


public class PalindromePartitioning {

	private void foo(ArrayList<String> list, int pos) {
		if(pos > str.length()-1){
			ret.add(list);
		} else {
			for(int i=pos; i<str.length(); i++){
				if(isPali(pos, i)){
					ArrayList<String> newList = new ArrayList<String>(list);
					newList.add(str.substring(pos, i+1));
					foo(newList, i+1);
				}
			}
		}
	}
	
	private boolean isPali(int start, int end) {
		while(start < end){
			if(str.charAt(start) != str.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public ArrayList<ArrayList<String>> ret;
	public String str;
	public ArrayList<ArrayList<String>> partition(String s) {
		ret = new ArrayList<ArrayList<String>>();
		str = s;
		foo(new ArrayList<String>(), 0);
		return ret;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PalindromePartitioning p = new PalindromePartitioning();
		System.out.println(p.partition("aab"));
	}

}
