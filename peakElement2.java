public class peakElement2 {
  
  public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int left = 0;
        int right = m-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            // max column element
            int maxRow = 0;
            for(int i = 0;i<n;i++){
                if(mat[i][mid]>mat[maxRow][mid]) maxRow = i;
            }
            int leftVal = (mid>0) ? mat[maxRow][mid-1] : -1;
            int rightVal = (mid<m-1) ? mat[maxRow][mid+1] : -1;
            if((mat[maxRow][mid]>leftVal) && (mat[maxRow][mid]>rightVal)){
                return new int[] {maxRow,mid};
            }
            else if(leftVal>mat[maxRow][mid]) right = mid-1;
            else left = mid+1;
        }
        return new int[] {-1,-1};
    }

     /* BRUTE
    public int[] findPeakGrid(int[][] mat) {
        int rowLen = mat.length;
        int colLen = mat[0].length;
        for(int i = 0;i<rowLen;i++){
            for(int j = 0;j<colLen;j++){
                int up = (i>0) ? mat[i-1][j] : -1;
                int down = (i<rowLen-1) ? mat[i+1][j] : -1;
                int left = (j>0) ? mat[i][j-1] : -1;
                int right = (j<colLen-1) ? mat[i][j+1] : -1;
                if(mat[i][j]>up && mat[i][j]>down &&
                mat[i][j]>left && mat[i][j]>right) return new int[]{i,j};
            }
        }
        return new int[] {-1,-1};
    } */
}
