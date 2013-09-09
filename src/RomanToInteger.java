
public class RomanToInteger {

	private int r2i(char c){
		switch(c){
		case 'I' : return 1;
		case 'V' : return 5;
		case 'X' : return 10;
		case 'L' : return 50;
		case 'C' : return 100;
		case 'D' : return 500;
		case 'M' : return 1000;
		default : return 0;
		}
	}
	public int romanToInt(String s) {
		int sum = 0;
		for(int i=0; i<s.length();){
			char c = s.charAt(i);
			if(i == s.length()-1){
				sum += r2i(c);
				i++;
			} else {
				char next = s.charAt(i+1);
				if(c == 'C' && next == 'M'){
					sum += 900;
					i += 2;
				} else if(c == 'C' && next == 'D'){
					sum += 400;
					i += 2;
				} else if(c == 'X' && next == 'C'){
					sum += 90;
					i += 2; 
				} else if(c == 'X' && next == 'L'){
					sum += 40;
					i += 2;
				} else if(c == 'I' && next == 'X'){
					sum += 9;
					i += 2;
				} else if(c == 'I' && next == 'V'){
					sum += 4;
					i += 2;
				} else {
					sum += r2i(c);
					i++;
				}
				
			}
		}
		return sum;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RomanToInteger r = new RomanToInteger();
		System.out.println(r.romanToInt("DCC"));
	}

}
