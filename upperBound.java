package BinarySearch;

public class upperBound {
  
  public int upperBound(int[] nums, int x) {
        int ans = nums.length;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]>x){
                ans = mid; // potential answer
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }
}
