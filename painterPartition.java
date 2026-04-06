public class painterPartition {
  
  public int paint(int A, int B, int[] C) {
        int ans = 0;
        int start = 0;
        int end = 0;
        for(int i = 0;i<C.length;i++){
            start = Math.max(start,C[i]);
            end += C[i];
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            int assignedPainter = totalPainter(C,mid);
            if(assignedPainter<=A){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans*B;
  }

    public int totalPainter(int[] C, int mid, int B){
        int painters = 1;
        int units = 0;
        for(int i = 0;i<C.length;i++){
            units += C[i];
            if(units>mid){
                painetrs++;
                units = C[i];
            }
        }
        return painters;
    }
}
