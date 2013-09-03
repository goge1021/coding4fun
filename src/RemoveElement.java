
public class RemoveElement {

	public int removeElement(int[] A, int elem) {
        int cur = 0;
        int end = A.length-1;
        while(cur <= end){
            if(A[cur] == elem){
                A[cur] = A[end];
                end--;
            } else {
                cur++;
            }
        }
        return end+1;
    }
}
