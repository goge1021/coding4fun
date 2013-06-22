
public class EditDistance {

	public int minDistance(String word1, String word2) {
		int n = word1.length();
		int m = word2.length();
		if(m*n == 0){
			return m+n;
		}
		int[][] distance = new int[m+1][n+1];
		for(int i=0; i<=m; i++)
			distance[i][0] = i;
		for(int i=0; i<=n; i++)
			distance[0][i] = i;
		
		char[] w1 = word1.toCharArray();
		char[] w2 = word2.toCharArray();
		for(int i=1; i<=m; i++){
			for(int j=1; j<=n; j++){
				if(w2[i-1] == w1[j-1]){
					distance[i][j] = Math.min(Math.min(distance[i-1][j-1], distance[i-1][j]+1), distance[i][j-1]+1);
				} else {
					distance[i][j] = Math.min(Math.min(distance[i-1][j-1]+1, distance[i-1][j]+1), distance[i][j-1]+1);
				}
			}
		}
		return distance[m][n];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EditDistance e = new EditDistance();
		System.out.println(e.minDistance("a", "ab"));
	}

}
