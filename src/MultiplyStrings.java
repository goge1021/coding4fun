
public class MultiplyStrings {

	public String multiply(String num1, String num2) {
		if(num1.equals("0") || num2.equals("0")){
			return "0";
		}else {
			String sum = "0";
			for(int i=num2.length()-1; i>=0; i--){
				char c = num2.charAt(i);
				if(c != '0'){
					int jin = 0, mult;
					String sb = "";
					for(int j=num1.length()-1; j>=0; j--){
						mult = (c-'0') * (num1.charAt(j)-'0') + jin;
						jin = mult/10;
						sb = (mult%10)+sb;
					}
					if(jin != 0){
						sb = jin + sb;
					}
					if(num2.length()-1-i != 0)
						sb = String.format("%s%0"+(num2.length()-1-i)+"d", sb, 0);
					sum = add(sum, sb);
				}
			}
			return sum;
		}
	}
	private String add(String a, String b) {
		int len1 = a.length();
		int len2 = b.length();
		int jin = 0, sum;
		String s = "";
		int a1,b1;
		for(int i=len1-1, j=len2-1; i>=0 || j>=0; i--,j--){
			if(i < 0){
				a1 = 0;
			} else {
				a1 = a.charAt(i) - '0';
			}
			if(j < 0){
				b1 = 0;
			} else {
				b1 = b.charAt(j) - '0';
			}
			sum = a1 + b1 + jin;
			s = (sum%10) + s;
			jin = sum / 10;
		}
		if(jin != 0){
			s = jin + s;
		}
		return s;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MultiplyStrings m = new MultiplyStrings();
		System.out.println(m.multiply("93553535314", "25247452591474"));
	}

}
