public class subsequenceExistWithsumK {
  
  public boolean checkSubsequenceSum(int[] nums, int k) {
        return checksubsequencesum(nums,k,0,0);
    }

    public boolean checksubsequencesum(int[] nums, int k, int idx, int sum){
        if(idx==nums.length){
            if(sum==k) return true;
            else return false;
        }
        // take
        if(checksubsequencesum(nums,k,idx+1,sum+nums[idx])==true) return true;
        // not-take
        if(checksubsequencesum(nums,k,idx+1,sum)==true) return true;
        return false;
    }
    
}
