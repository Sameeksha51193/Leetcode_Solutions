package Arrays;

public class largestElement {
  
  public int largestElement(int[] nums) {
    
    int n = nums.length;
    int max = nums[0];
    for(int i = 0;i<n;i++){
        if(nums[i]>max) max = nums[i];
    }
    return max;
    }
}
