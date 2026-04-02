import java.util.ArrayList;

public class timesArrRotated {
  
  public int findKRotation(ArrayList<Integer> nums) {
        int start = 0;
        int end = nums.size()-1;
        int min = Integer.MAX_VALUE;
        int minidx = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            // identify sorted half
            if(nums.get(start)>nums.get(mid)){
                // right is sorted
                if(nums.get(mid)<min){
                    min = nums.get(min);
                    minidx = mid;
                }
                end = mid-1;
            }
            else{
                // left is sorted
                if(nums.get(start)<min){
                    min = nums.get(start);
                    minidx = start;
                }
                start = mid+1;
            }
        }
        return minidx;
    }
}
