import java.util.Arrays;


public class PalindromePartitioning2 {

	public int minCut(String s) {
		if(s == null || s.length() == 0){
			return 0;
		}
		int[] ret = new int[s.length()];
		boolean[][] pali = new boolean[s.length()][s.length()];
		Arrays.fill(ret, Integer.MAX_VALUE);
		ret[0] = 0;
		pali[0][0] = true;
		for(int i=1; i<s.length(); i++){
			for(int j=0; j<=i; j++){
				if(isPali(j, i, s, pali)){
					if(j == 0){
						ret[i] = Math.min(ret[i], 0);
					} else {
						ret[i] = Math.min(ret[i], ret[j-1]+1);
					}
				}
			}
		}
		return ret[ret.length-1];
    }
	private boolean isPali(int start, int end, String s, boolean[][] pali) {
		if(s.charAt(start) == s.charAt(end)){
			if(start+1 > end-1){
				pali[start][end] = true;
				return true;
			} else if(pali[start+1][end-1]){
				pali[start][end] = true;
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PalindromePartitioning2 p = new PalindromePartitioning2();
		System.out.println(p.minCut("aab"));

	}

}
