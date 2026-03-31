package Arrays;

import java.util.ArrayList;
import java.util.List;

public class majorityElement2 {

  public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0; int count2 = 0; int num1 = -1; int num2 = -1;
        for(int i = 0;i<n;i++){
            if(nums[i]==num1) count1++;
            else if(nums[i]==num2) count2++;
            else if(count1==0){
                num1 = nums[i];
                count1 = 1;
            }
            else if(count2==0){
                num2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
            
        }
        // Verify
        count1 = 0; count2 = 0;
        for(int num:nums){
            if(num == num1) count1++;
            else if(num == num2) count2++;
        }
        List<Integer> ans = new ArrayList<>();
        if(count1>n/3) ans.add(num1);
        if(count2>n/3) ans.add(num2);
        return ans;
    }
}
