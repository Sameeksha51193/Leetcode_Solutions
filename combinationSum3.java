import java.util.ArrayList;
import java.util.List;

public class combinationSum3 {
  
  public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtracking(k,n,ans,temp,1);
        return ans;
    }

    public void backtracking(int k, int n,List<List<Integer>> ans, List<Integer> temp, int idx){
        if(n==0 && k==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx;i<=9;i++){
            if(n>=i){
                temp.add(i);
                backtracking(k-1,n-i,ans,temp,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
