package TwoPointers&SlidingWindow;

public class maxConsecutiveOnes {
  
  // OPTIMAL
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int l = 0;
        int r = 0;
        int countZeroes = 0;
        while(r<nums.length){
            if(nums[r]==0) countZeroes++;
            if(countZeroes>k){ // invalid window so shrink
                if(nums[l]==0) countZeroes--;
                l++;
            }
            if(countZeroes<=k)maxLen = Math.max(maxLen,r-l+1); // valid window
            r++;
        }
        return maxLen;
    }

    /* BETTER - O(2N)
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int l = 0;
        int r = 0;
        int countZeroes = 0;
        while(r<nums.length){
            if(nums[r]==0) countZeroes++;
            while(countZeroes>k){ // invalid window so shrink
                if(nums[l]==0) countZeroes--;
                l++;
            }
            if(countZeroes<=k) maxLen = Math.max(maxLen,r-l+1); // valid window
            r++;
        }
        return maxLen;
    } */

    /* BRUTE
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        for(int i = 0;i<nums.length;i++){
            int countZeroes = 0;
            for(int j = i;j<nums.length;j++){
                if(nums[j]==0) countZeroes++;
                if(countZeroes>k) break; 
                int len = j-i+1;
                maxLen = Math.max(len,maxLen);
            }
        }
        return maxLen;
    } */
}
