
public class ValidNumber {

	public boolean isNumber(String s) {
		int state = 0;
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			switch(state){
			case 0 :
				if(c == ' '){
					state = 0;
				} else if(c == '+' || c == '-'){
					state = 1;
				} else if(c >= '0' && c <= '9'){
					state = 2;
				} else if(c == '.'){
					state = 4;
				} else {
					return false;
				}
				break;
			case 1 :
				if(c >= '0' && c <= '9'){
					state = 2;
				} else if(c == '.'){
					state = 4;
				} else {
					return false;
				}
				break;
			case 2 :
				if(c >= '0' && c <= '9'){
					state = 2;
				} else if(c == '.'){
					state = 3;
				} else if(c == 'e'){
					state = 5;
				} else if(c == ' '){
					state = 8;
				} else {
					return false;
				}
				break;
			case 3 :
				if(c >= '0' && c <= '9'){
					state = 3;
				} else if(c == 'e'){
					state = 5;
				} else if(c == ' '){
					state = 8;
				} else {
					return false;
				}
				break;
			case 4 :
				if(c >= '0' && c <= '9'){
					state = 3;
				} else {
					return false;
				}
				break;
			case 5 :
				if(c >= '0' && c <= '9'){
					state = 7;
				} else if(c == '+' || c == '-'){
					state = 6;
				} else {
					return false;
				}
				break;
			case 6 :
				if(c >= '0' && c <= '9'){
					state = 7;
				} else {
					return false;
				}
			case 7 :
				if(c >= '0' && c <= '9'){
					state = 7;
				} else if(c == ' '){
					state = 8;
				} else {
					return false;
				}
				break;
			case 8 :
				if(c == ' '){
					state = 8;
				} else {
					return false;
				}
				break;
			}
		}
		if(state == 2 || state == 3 || state == 7 || state == 8){
			return true;
		} else {
			return false;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ValidNumber v = new ValidNumber();
		System.out.println(v.isNumber("1.2e+0"));
	}

}
