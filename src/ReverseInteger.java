
public class ReverseInteger {

	public int reverse(int x) {
        int isPositive = 1;
        if(x < 0){
            isPositive = -1;
            x = -x;
        }
        int ret = 0;
        int digit = 0;
        while(x != 0){
            digit = x % 10;
            ret = ret * 10 + digit;
            x = x / 10;
        }
        return ret * isPositive;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseInteger r = new ReverseInteger();
		System.out.println(r.reverse(1000000003));
	}

}
