package BinarySearch;

public class floor&Ceil {
  
  public int[] getFloorAndCeil(int[] nums, int x) {
        int floor = -1;
        int ceil = -1;
       int start = 0;
       int end = nums.length-1;
       while(start<=end){
        int mid = start+(end-start)/2;
        if(nums[mid]==x) return new int[] {nums[mid],nums[mid]};
        else if(nums[mid]>x){
            ceil = nums[mid]; // potential ceil
            end = mid-1;
        }
        else{
            floor = nums[mid]; // potential floor
            start = mid+1;
        }
       }
       return new int[] {floor,ceil};
    }
}
