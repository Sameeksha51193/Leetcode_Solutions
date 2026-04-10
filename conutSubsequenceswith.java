public class conutSubsequenceswith SumK {
  
public int countSubsequenceWithTargetSum(int[] nums, int k) {
        return countSubsequenceWithTarget (nums,k,0,0);
    }

    public int countSubsequenceWithTarget (int[] nums, int k, int sum, int idx){
        if(idx==nums.length){
            if(sum==k) return 1;
            else return 0;
        }
        // take
        int take = countSubsequenceWithTarget(nums,k,sum+nums[idx],idx+1);
        // not take
        int nottake = countSubsequenceWithTarget(nums,k,sum,idx+1);
        return take+nottake;
    }
}
