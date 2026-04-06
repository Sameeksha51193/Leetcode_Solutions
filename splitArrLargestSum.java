public class splitArrLargestSum {
  
  public int splitArray(int[] nums, int k) {
        int ans = 0;
        int start = 0;
        int end = 0;
        for(int i = 0;i<nums.length;i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            int splits = assignedSplits(nums, mid);
            if(splits<=k){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }

    public int assignedSplits(int[] nums, int mid){
        int splits = 1;
        int splitSum = 0;
        for(int i = 0;i<nums.length;i++){
            splitSum += nums[i];
            if(splitSum>mid){
                splits++;
                splitSum = nums[i];
            }
        }
        return splits;
    }
}
