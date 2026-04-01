package BinarySearch;

public class first&lastPosition {
  
  public int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(nums,target); // O(log n)
        // if 1st occurence is not there, then no last occurence
        if(first==-1) return new int[] {-1,-1}; 
        int last = lastOccurence(nums,target); // O(log n)
        return new int[] {first,last};
    }

    public int firstOccurence(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int first = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                first = mid; // potential ans
                end = mid-1;
            }
            else if(nums[mid]>target) end = mid-1;
            else start = mid+1;
        }
        return first;
    }

    public int lastOccurence(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int last = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                last = mid; // potential ans
                start = mid+1;
            }
            else if(nums[mid]>target) end = mid-1;
            else start = mid+1;
        }
        return last;
    }
}
