public class sudokuSolver {
  
  public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board){
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char num = '1';num<='9';num++){
                        if(isValid(board,num,i,j)){
                            board[i][j] = num;
                            if(solve(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false; // no number fits
                }
            }
        }
        return true; // solved
    }

    public boolean isValid(char[][] board, int num, int row, int col){
        for(int i = 0;i<9;i++){
            if(board[row][i] == num) return false; // row check
            if(board[i][col] == num) return false; // column check
            // 3X3 box check
            int r = 3*(row/3) + i/3;
            int c = 3*(col/3) + i%3;
            if(board[r][c] == num) return false;
        }
        return true;
    }
}
