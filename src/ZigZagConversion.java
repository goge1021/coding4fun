
public class ZigZagConversion {

	public String convert(String s, int nRows) {
        if(nRows == 1){
            return s;
        } else {
            int n = nRows * 2 -2;
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<nRows; i++){
                if(i == 0){
                    for(int j=0; j<s.length(); j+=n){
                        sb.append(s.charAt(j));
                    }
                } else if(i == nRows-1){
                    for(int j=i; j<s.length(); j+=n){
                        sb.append(s.charAt(j));
                    }
                } else {
                    for(int x=i,y=n-i; x<s.length(); x+=n, y+=n){
                        sb.append(s.charAt(x));
                        if(y<s.length())
                            sb.append(s.charAt(y));
                    }
                }
            }
            return sb.toString();
        }
    }

}
