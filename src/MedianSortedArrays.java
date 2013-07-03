
public class MedianSortedArrays {
	public double findMedianSortedArrays(int A[], int B[]) {
        int m = A.length;
        int n = B.length;
        
        //need (m+n)/2-1 and (m+n)/2 or (m+n)/2
        int i=0,j=0;
        int current = 0;
        double ret = 0;
        for(int pos = 0; pos <= (m+n)/2; pos++){
            if(j >= n){
                current = A[i];
                i++;
            } else if(i >= m){
                current = B[j];
                j++;
            } else if(A[i] < B[j]){
                current = A[i];
                i++;
            } else if(A[i] >= B[j] ){
                current = B[j];
                j++;
            }
            if( (m+n) % 2 == 0 && pos == (m+n)/2-1 ){
                ret += current;
            } else if( pos == (m+n)/2 ){
                ret += current;
            }
        }
        if( (m+n) % 2 == 0 ) {
            return ret/2;
        } else {
            return ret;
        }
    }
}
