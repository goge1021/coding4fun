
public class PalindromeNumber {

	public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        } else {
            int k = 1;
            while(x / k >= 10){
                k *= 10;
            }
            while(x > 9){
                if(x/k != x%10){
                    return false;
                }
                x = (x % k) / 10;
                k /= 100;
            }
            return true;
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PalindromeNumber p = new PalindromeNumber();
		System.out.println(p.isPalindrome(12421));
	}

}
