public class AddBinary {
    
    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        if(aLen < bLen){
            a = String.format("%0"+(bLen-aLen)+"d",0) + a;
        } else if(aLen > bLen){
            b = String.format("%0"+(aLen-bLen)+"d",0) + b;
        }
        
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        char[] c = new char[a1.length];
        int pre = 0;
        int sum;
        for(int i=c.length-1; i>=0; i--){
            sum = (a1[i]-'0') + (b1[i]-'0') + pre;
            pre = sum / 2;
            c[i] = (char)((sum % 2) + '0');
        }
        if(pre == 1){
            return "1"+String.valueOf(c);
        } else {
            return String.valueOf(c);
        }
    }
}
