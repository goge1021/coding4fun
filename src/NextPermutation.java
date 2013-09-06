
public class NextPermutation {

	public void nextPermutation(int[] num) {
		if(num != null && num.length != 0) {
			int pre = num[num.length-1];
			int pos = -1;
			boolean isFind = false;
			for(int i=num.length-2; i>=0; i--){
				if(num[i] >= pre){
					pre = num[i];
				} else {
					pos = i;
					isFind = true;
					break;
				}
			}
			if(isFind){
				for(int i=num.length-1; i>=0; i--){
					if(num[i] > num[pos]){
						int tmp = num[i];
						num[i] = num[pos];
						num[pos] = tmp;
						break;
					}
				}
			}
			int start = pos+1;
			int end = num.length-1;
			while(start < end){
				int tmp = num[start];
				num[start] = num[end];
				num[end] = tmp;
				start++;
				end--;
			}
		}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NextPermutation n = new NextPermutation();
		int[] a = new int[] {2,2,5,1,1};
		n.nextPermutation(a);
		for(int i : a){
			System.out.println(i);
		}
	}

}
