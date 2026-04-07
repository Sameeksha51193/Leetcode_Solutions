public class max1in2Dmatrix {
  
  public int rowWithMax1s(int[][] mat) {
        int rowLen = mat.length;
        int colLen = mat[0].length;
        int maxRowOnes = 0;
        int idx = -1;
       for(int i = 0;i<rowLen;i++){
        int rowOnes = totalOnes(mat[i]);
        if(rowOnes>maxRowOnes){
            maxRowOnes = rowOnes;
            idx = i;
        }
       }
       return idx;
    }

    public int totalOnes(int[]row){
        int ans = -1; // first occurence
        int start = 0;
        int end = row.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(row[mid]==1){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        if(ans==-1) return 0;
        return row.length-ans;
    }

    /* BRUTE
    public int rowWithMax1s(int[][] mat) {
        int rowidx = -1;
        int maxSum = 0;
        int rowLen = mat.length;
        int colLen = mat[0].length;
       for(int i = 0;i<rowLen;i++){
        int rowSum = 0;
        for(int j = 0;j<colLen;j++){
            rowSum += mat[i][j];
        }
        if(rowSum>maxSum){
            maxSum = rowSum;
            rowidx = i;
        }
       }
       return rowidx;
    } */
}
