package Arrays;

public class moveZeroes {
  
  public void moveZeroes(int[] nums) {
        int n = nums.length;
        // 1st zero
        int z = -1;
        for(int i = 0;i<n;i++){
            if(nums[i]==0){
                z = i;
                break;
            }
        }
        if(z==-1) return;
        for(int i = z+1;i<n;i++){
            if(nums[i]!=0){
                // swap
                int temp = nums[z];
                nums[z] = nums[i];
                nums[i] = temp;
                z++;
            }
        }
    }

    /* public void moveZeroes(int[] nums) {
        int n = nums.length;
        int z = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]!=0){
                // swap
                int temp = nums[z];
                nums[z] = nums[i];
                nums[i] = temp;
                z++;
            }
        }
    } */

    /* public void moveZeroes(int[] nums) {
        int n = nums.length;
        int z = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]!=0) nums[z++] = nums[i];
        }
        // fill zeroes
        while(z<=n-1) nums[z++] = 0;
    } */
}
