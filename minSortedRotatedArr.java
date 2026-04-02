public class minSortedRotatedArr {
  
  public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(start<=end){
            int mid = start+(end-start)/2;
            // identify sorted half
            if(nums[start]>nums[mid]){
                // right half is sorted
                min = Math.min(nums[mid],min);
                end = mid-1;
            }
            else{
                // left half is sorted
                min = Math.min(nums[start],min);
                start = mid+1;
            }
        }
        return min;
    }
}
