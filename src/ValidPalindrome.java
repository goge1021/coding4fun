
public class ValidPalindrome {

	public boolean isPalindrome(String s) {
        if(s.equals("")){
            return true;
        }
        s = s.toLowerCase();
        int len = s.length();
        int min = 0;
        int max = len-1;
        while(max >= min){
            while(min<len && !Character.isLetterOrDigit(s.charAt(min))){
            	min++;
            }
            while(max>=0 && !Character.isLetterOrDigit(s.charAt(max))){
            	max--;
            }
            if(min > max) 
            	break;
            if(s.charAt(min) != s.charAt(max)){
                return false;
            }
            min++;
            max--;
        }
        return true;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ValidPalindrome v = new ValidPalindrome();
		System.out.println(v.isPalindrome("!!!"));
	}

}
