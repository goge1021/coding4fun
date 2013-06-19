public class Pow {
    public double pow(double x, int n){
    	boolean isNeg = false;
		if(n < 0){
			n = -n;
			isNeg = true;
		}
		int binaryLen = Integer.toString(n, 2).length();
		double[] temp = new double[binaryLen];
		temp[0] = x;
		for(int i=1; i<binaryLen; i++){
			temp[i]= temp[i-1] * temp[i-1];
		}
		double ret = 1;
		for(int i=0; i<binaryLen; i++){
			if((n&1) == 1){
				ret *= temp[i];
			}
			n = n >> 1;
		}
		return isNeg?1/ret:ret;
	}
	
	public static void main(String[] args){
		Pow p = new Pow();
		System.out.print(p.pow(2,12));
	}
}
