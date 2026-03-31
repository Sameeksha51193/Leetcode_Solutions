package Arrays;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
  
  public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            int num = 1; // always start with 1
            for(int j = 0;j<=i;j++){
                temp.add(num);
                num = num*(i-j)/(j+1);
            }
            ans.add(temp);
        }
        return ans;
    }
}
