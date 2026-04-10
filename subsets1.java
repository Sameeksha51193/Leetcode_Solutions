import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subsets1 {
  
  public List<Integer> subsetSums(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        powerSet(nums,ans,0,0);
        Collections.sort(ans);
        return ans;
    }

    public void powerSet(int[] nums, List<Integer> ans, int idx, int sum){
        if(idx==nums.length){
            ans.add(sum);
            return;
        }
        powerSet(nums,ans,idx+1,sum+nums[idx]);
        powerSet(nums,ans,idx+1,sum);
    }
}
