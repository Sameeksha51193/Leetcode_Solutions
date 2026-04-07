package Recursion;

import java.util.ArrayList;
import java.util.List;

public class powerSet {
  
  public List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        powerset(0,ans,temp,nums);
        return ans;
    }

    public void powerset(int idx, List<List<Integer>> ans, List<Integer> temp, int[] nums){
        if(idx == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]); // take
        powerset(idx+1,ans,temp,nums);
        temp.remove(temp.size()-1); // not-take
        powerset(idx+1,ans,temp,nums);
    }
}
