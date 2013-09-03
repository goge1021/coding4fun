
public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {
        int state = 0;
        char c;
        int len = 0;
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            switch(state){
                case 0 : 
                    if(c == ' '){
                        state = 1;
                    } else {
                        state = 2;
                        len = 1;
                    }
                    break;
                case 1:
                    if(c != ' '){
                        state = 2;
                        len = 1;
                    }
                    break;
                case 2:
                    if(c != ' '){
                        len++;
                    } else {
                        state = 1;
                    }
                    break;
            }
        }
        return len;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LengthOfLastWord l = new LengthOfLastWord();
		System.out.println(l.lengthOfLastWord("Hello  World"));
	}

}
