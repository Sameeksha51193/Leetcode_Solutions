import java.util.Arrays;

public class aggressiveCows {
  
  public int aggressiveCows(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        int start = 1;
        int end = nums[nums.length-1]-nums[0];
        while(start<=end){
            int mid = start+(end-start)/2;
            int cowsCount = totalPlacedCows(nums,mid);
            if(cowsCount>=k){
                ans = mid;
                start = mid+1;
            }
            else end = mid-1;
        }
        return ans;
    }

    public int totalPlacedCows(int[] nums, int mid){
        int cows = 1;
        int lastCowPosition = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]-lastCowPosition>=mid){
                lastCowPosition = nums[i];
                cows++;
            }
        }
        return cows;
    }
}
