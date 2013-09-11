
public class TrappingRainWater {

	public int trap(int[] A) {
		if(A == null || A.length == 0){
			return 0;
		}
		int state = 0;
		int start=0, end=0;
		int pre = -1;
		int rain = 0;
		while(rain != pre){
			state = 0;
			pre = rain;
			for(int i=1; i<A.length; i++){
				switch(state){
				case 0 :
					if(A[i] < A[i-1]){
						state = 1;
						start = i-1;
					}
					break;
				case 1 :
					if(A[i] > A[i-1]){
						state = 2;
						end = i;
					}
					break;
				case 2 :
					if(A[i] < A[i-1]){
						state = 1;
						end = i-1;
						int h = Math.min(A[start], A[end]);
						for(int j=start; j<=end; j++){
							if(A[j] < h){
								rain += h-A[j];
								A[j] = h;
							}
						}
						start = i-1;
					} else {
						end = i;
					}
					break;
				}
			}
			int h = Math.min(A[start], A[end]);
			for(int j=start; j<=end; j++){
				if(A[j] < h){
					rain += h-A[j];
					A[j] = h;
				}
			}
		}
		return rain;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TrappingRainWater t = new TrappingRainWater();
		System.out.println(t.trap(new int[]{8,5,1,1,7,3,2,1,5,8,3}));
	}

}
