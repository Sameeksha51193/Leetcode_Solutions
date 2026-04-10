import java.util.ArrayList;
import java.util.List;

public class combinationSum {
  
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combinationsum(candidates,target,ans,temp,0);
        return ans;
    }

    public void combinationsum(int[] candidates, int target, List<List<Integer>> ans, List<Integer> temp,int idx){
        if(idx==candidates.length){
            if(target==0) ans.add(new ArrayList<>(temp));
            return;
        }
        if(candidates[idx]<=target){
            temp.add(candidates[idx]);
            combinationsum(candidates,target-candidates[idx],ans,temp,idx); // take
            temp.remove(temp.size()-1);
        }  
        combinationsum(candidates,target,ans,temp,idx+1); // not-take
    }
}
