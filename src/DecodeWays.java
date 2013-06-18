
public class DecodeWays {
	
	public int numDecodings(String s) {
        if(s == null || s.equals("")){
        	return 0;
        }
		char[] string = s.toCharArray();
        int[] decodeNum = new int[string.length+1];
        decodeNum[decodeNum.length-1] = 1;
        
        for(int i=string.length-1; i>=0; i--){
        	if(string[i] == '0'){
        		decodeNum[i] = 0;
        	} else {
        		if(i == string.length-1){
        			decodeNum[i] = 1;
        		} else if(Integer.parseInt(String.valueOf(string, i, 2)) <= 26){
        			decodeNum[i] = decodeNum[i+1] + decodeNum[i+2];
        		} else {
        			decodeNum[i] = decodeNum[i+1];
        		}
        	}
        }
        
		return decodeNum[0];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DecodeWays dw = new DecodeWays();
		long s = System.currentTimeMillis();
		System.out.println(dw.numDecodings("1787897759966261825913315262377298132516969578441236833255596967132573482281598412163216914566534565"));
		System.out.println(System.currentTimeMillis()-s);
	}

}
