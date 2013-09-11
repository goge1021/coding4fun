
public class WordSearch {

	public boolean exist(char[][] board, String word) {
		if(board == null || board.length == 0 || word.equals("")){
			return false;
		}
		char first = word.charAt(0);
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[0].length; j++){
				if(board[i][j] == first){
					if(find(board, i, j, word, 0)){
						return true;
					}
				}
			}
		}
		return false;
	}
	private boolean find(char[][] board,int x, int y, String word, int pos) {
		if(pos >= word.length()){
			return true;
		}
		if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] == 0){
			return false;
		}
		
		char c = board[x][y];
		if(c == word.charAt(pos)){
			board[x][y] = 0;
			boolean success = find(board, x-1, y, word, pos+1) || find(board, x+1, y, word, pos+1)
					|| find(board, x, y-1, word, pos+1) || find(board, x, y+1, word, pos+1);
			board[x][y] = c;
			return success;
		} else {
			return false;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WordSearch w = new WordSearch();
		System.out.println(w.exist(new char[][]{
				{'A', 'B', 'C', 'E'},
				{'S', 'F', 'C', 'S'},
				{'A', 'D', 'E', 'E'}
		}, "ABCB"));

	}

}
