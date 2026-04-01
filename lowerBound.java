public class lowerBound {
  
  public int lowerBound(int[] nums, int x) {
       int start = 0;
       int end = nums.length-1;
       int ans = nums.length;
       while(start<=end){
        int mid = start+(end-start)/2;
        if(nums[mid]>=x){
            ans = mid; // potential ans
            end = mid-1;
        }
        else start = mid+1;
       }
       return ans;
  }
}
