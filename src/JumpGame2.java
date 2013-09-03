
public class JumpGame2 {

	public int jump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] ret = new int[A.length];
        //Arrays.fill(ret, Integer.MAX_VALUE);
        ret[ret.length-1] = 0;
        for(int i=ret.length-2; i>=0; i--){
            if(A[i] == 0){
                ret[i] = Integer.MAX_VALUE;
            } else {
                int min = Integer.MAX_VALUE;
                for(int j=1; j<=A[i] && i+j < A.length; j++){
                    if(ret[i+j] < min){
                        min = ret[i+j];
                    }
                }
                min = min == Integer.MAX_VALUE ? min : min+1;
            }
        }
        return ret[0];
    }
	
	public int jump2(int[] A) {
		int n = A.length;
		int[] f = new int[A.length];
		int maxPos = 0;
		f[0] = 0;

		for (int i = 0; i <= maxPos; i++) {
			int pos = i + A[i];
			if (pos >= n)
				pos = n - 1;

			if (pos > maxPos) {
				for (int j = maxPos + 1; j <= pos; j++)
					f[j] = f[i] + 1;
				maxPos = pos;
			}

			if (maxPos >= n - 1)
				return f[n - 1];
		}
		return f[n - 1];
	}
}
