public class searchinRotated2 {
  
  public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target) return true;
            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                start++;
                end--;
                continue;
            }
            // right is sorted
            if(nums[start]>nums[mid]){
                if(nums[mid]<target && target<=nums[end]) start = mid+1;
                else end = mid-1;
            }
            // left is sorted
            else{
                if(nums[start]<=target && target<nums[mid]) end = mid-1;
                else start = mid+1;
            }
        }
        return false;
    }
}
