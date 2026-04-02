public class searchinRotated {
  
  public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target) return mid;
            // identify sorted half - right or left
            if(nums[start]>nums[mid]){
                // right half is sorted - mid -> end
                if(nums[mid]<target && target<=nums[end]) start = mid+1;
                else end = mid-1;
            }
            else {
                // left half is sorted - start -> mid-1
                if(nums[start]<=target && target<nums[mid]) end = mid-1;
                else start = mid+1;
            }
        }
        return -1;
    }
}
