package Arrays;

public class secondLargestElement {
  
  public int secondLargestElement(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int secMax = -1;
        for(int i = 1;i<n;i++){
            if(nums[i]>max){
                secMax = max;
                max = nums[i];
            }
            else if(nums[i]>secMax && max!=nums[i]) secMax = nums[i];
        }
        return secMax;
    }

    /* BETTER - O(2n)
    public int secondLargestElement(int[] nums) {
        int n = nums.length;
        int maxi = largestElement(nums);
        int secMax = -1;
        for(int i = 0;i<n;i++){
        if(nums[i]>secMax && nums[i]!=maxi) secMax = nums[i];
        }
        return secMax;
    }

    public int largestElement(int[] nums) {
    int n = nums.length;
    int max = nums[0];
    for(int i = 0;i<n;i++){
        if(nums[i]>max) max = nums[i];
    }
    return max;
    } */
}
