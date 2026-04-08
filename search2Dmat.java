public class search2Dmat {
  
  public boolean searchMatrix(int[][] matrix, int target) {
        // TC - O(log(m*n))
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int start = 0;
        int end = rowLen*colLen-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int rIdx = mid/colLen;
            int cIdx = mid%colLen;
            if(matrix[rIdx][cIdx]==target) return true;
            else if(matrix[rIdx][cIdx]>target) end = mid-1;
            else start = mid+1;
        }
        return false;
    }

    /* OPTIMAL - TC - O(n) + log(m)
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        for(int i = 0;i<rowLen;i++){
            if(matrix[i][0]<= target && matrix[i][colLen-1]>=target){
                return find(matrix[i],target);
            }
        }
        return false;
    }

    public boolean find (int[] row, int target){
        int start = 0;
        int end = row.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(row[mid]==target) return true;
            else if(row[mid]>target) end = mid-1;
            else start = mid+1;
        }
        return false;
    }

    /* BETTER
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        boolean found = false;
        for(int i = 0;i<rowLen;i++){
            if(find(matrix[i],target)) return true;
        }
        return found;
    }
    public boolean find (int[] row, int target){
        int start = 0;
        int end = row.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(row[mid]==target) return true;
            else if(row[mid]>target) end = mid-1;
            else start = mid+1;
        }
        return false;
    } */

    /* BRUTE
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        for(int i = 0;i<rowLen;i++){
            for(int j = 0;j<colLen;j++){
                if(matrix[i][j]==target) return true;
            }
        }
        return false;
    } */
}
