import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
  
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        combinationsum2(candidates, target, ans, temp, 0);
        return ans;
    }

    public void combinationsum2(int[] candidates, int target, List<List<Integer>>  ans, List<Integer> temp, int idx) {
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]) continue;//not pick duplicate
            if(target>=candidates[i]){
                // pick
                temp.add(candidates[i]);
                combinationsum2(candidates, target-candidates[i], ans, temp, i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
