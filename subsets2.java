import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets2 {
  
  public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        powerSet(nums,ans,temp,0);
        return ans;
    }

    public void powerSet(int[] nums, List<List<Integer>> ans, List<Integer> temp, int idx) {
        ans.add(new ArrayList<>(temp)); // add at every step subset is valid
        for(int i = idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            powerSet(nums,ans,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
