import java.io.IOException;


public class PlusOne {

	public int[] plusOne(int[] digits) {
        int jin = 1;
		for(int i=digits.length-1; i>=0 && jin == 1; i--){
        	digits[i] += jin;
        	if(digits[i] >= 10){
        		digits[i] %= 10;
        		jin = 1;
        	} else {
        		jin = 0;
        	}
        }
		if(jin == 1){
			int[] newInt = new int[digits.length+1];
			System.arraycopy(digits, 0, newInt, 1, digits.length);
			newInt[0] = 1;
			return newInt;
		} else {
			return digits;
		}
    }
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PlusOne p = new PlusOne();
		int[] r = p.plusOne(new int[]{9, 8});
		for(int i=0; i<r.length; i++){
			System.out.println(r[i]);
		}
	}

}
