import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nQueen {
  
  public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        for(int i = 0;i<n;i++){
            char[] row = new char[n];
            Arrays.fill(row,'.');
            board.add(new String(row));
        }
        solve(0,n,ans,board);
        return ans;
    }

    public void solve (int col,int n, List<List<String>>ans, List<String>board){
        if(col==n){
            ans.add(new ArrayList<>(board));
            return;
        }
        for(int row = 0;row<n;row++){
            if(isSafe(row,col,n,board)){
                char[] temp = board.get(row).toCharArray();
                temp[col] = 'Q';
                board.set(row,new String(temp));
                solve(col+1,n,ans,board);
                temp[col] = '.';
                board.set(row,new String(temp));
            }
        }
        return;
    }

    public boolean isSafe(int r, int c,int n, List<String>board){
        int row = r;
        int col = c;
        while(row>=0 && col>=0){
            if(board.get(row).charAt(col)=='Q') return false;
            row--;
            col--;
        }
        row = r;
        col = c;
        while(col>=0){
            if(board.get(row).charAt(col)=='Q') return false;
            col--;
        }
        row = r;
        col = c;
        while(row<n && col>=0){
            if(board.get(row).charAt(col)=='Q') return false;
            col--;
            row++;
        }
        return true;
    }
}
