
public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] A) {
        if(A == null || A.length == 0){
            return 0;
        } else {
            int pre=1,cur=1;
            int preVal=A[0];
            while(cur < A.length){
                if(preVal == A[cur]){
                    cur ++;
                } else {
                    preVal = A[cur];
                    A[pre] = A[cur];
                    pre++;
                    cur++;
                }
            }
            return pre;
        }
    }
}
