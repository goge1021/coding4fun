
public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {
		int[] num = { 0x0001, 0x0002, 0x0004, 0x0008, 0x0010, 0x0020, 0x0040, 0x0080, 0x0100};
		int validH = 0, validV = 0;
		for(int i=0; i<9; i++){
			validH = 0;
			validV = 0;
			for(int j=0; j<9; j++){
				if(board[i][j] != '.'){
					int n = board[i][j] - '0';
					if((validH & num[n-1]) == 0){
						validH |= num[n-1];
					} else {
						return false;
					}
				}
				
				if(board[j][i] != '.'){
					int n = board[j][i] - '0';
					if((validV & num[n-1]) == 0){
						validV |= num[n-1];
					} else {
						return false;
					}
				}
			}
		}
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				validV = 0;
				for(int x=i*3; x<i*3+3; x++){
					for(int y=j*3; y<j*3+3; y++){
						if(board[x][y] != '.'){
							int n = board[x][y] - '0';
							if((validV & num[n-1]) == 0){
								validV |= num[n-1];
							} else {
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}
}
