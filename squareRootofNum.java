public class squareRootofNum {
  
  public int floorSqrt(int n) {
      int start = 1;
      int end = n;
      int ans = -1;
      while(start<=end){
        int mid = start+(end-start)/2;
        long val = (long)mid*mid;
        if(val<=n){
            ans = mid; // potential ans
            start = mid+1; // try bigger
        }
        else end = mid-1;;
      }
      return ans;
    }

    /* public int floorSqrt(int n) {
        int ans = -1;
      for(int i = 1;i<=n;i++){
        if(i*i<=n) ans = i;
        else break;
      }
      return ans;
    } */
}
