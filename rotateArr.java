package Arrays;

public class rotateArr {
  
  public void rotate(int[] nums, int k) {
        int n = nums.length;
        int r = k%n;
        reverse(0,n-1,nums);
        reverse(0,r-1,nums);
        reverse(r,n-1,nums);
    }

    public void reverse(int start, int end, int[] nums){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
