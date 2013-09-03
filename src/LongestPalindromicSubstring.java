
public class LongestPalindromicSubstring {

	public String preProcess(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append("^#");
		for(int i=0; i<s.length(); i++){
			sb.append(s.charAt(i)).append("#");
		}
		
		return sb.append("$").toString();
	}
	
	public String longestPalindrome(String s) {
		String str = preProcess(s);
		int mx = 0;
		int c = 0;
		int[] p = new int[str.length()-1];
		for(int i=1; i<str.length()-1; i++){
			int i_mirror = c - (i - c);
			p[i] = (mx > i) ? Math.min(mx-i, p[i_mirror]) : 0;
			
			while(str.charAt(i+p[i]+1) == str.charAt(i-p[i]-1))
				p[i]++;
			
			if(i+p[i] > mx){
				mx = i+p[i];
				c = i;
			}
		}
		
		int maxLen = 0;
		int center = 0;
		for(int j=0; j<p.length; j++){
			if(p[j] > maxLen){
				maxLen = p[j];
				center = j;
			}
		}
		int start = (center - 1 - maxLen)/2;
		return s.substring(start, start+maxLen);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LongestPalindromicSubstring l = new LongestPalindromicSubstring();
		System.out.println(l.longestPalindrome("ahiwheuihiuhiuhwgti"));

	}

}
