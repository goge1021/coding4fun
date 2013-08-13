
public class StringToInt {

	public int atoi(String str) {
		long ret = 0;
    	int positive = 1;
        str = str.trim();
		if(str == null || str.equals("")){
			return 0;
		} else {
			for(int i=0; i<str.length(); i++){
				char digit = str.charAt(i);
				if(digit == '-' && i == 0){
					positive = -1;
				} else if(digit == '+' && i == 0) {
					positive = 1;
				} else if(digit >= '0' && digit <= '9'){
					ret = ret*10 + (digit-'0');
				} else {
                    return (int)ret * positive;
				}
				if(positive == 1 && ret > Integer.MAX_VALUE){
					return Integer.MAX_VALUE;
				} else if(positive == -1 && ret * -1 < Integer.MIN_VALUE ){
					return Integer.MIN_VALUE;
				}
			}
			return (int)ret * positive;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringToInt sti = new StringToInt();
		System.out.println(sti.atoi("-2983268"));
	}

}
