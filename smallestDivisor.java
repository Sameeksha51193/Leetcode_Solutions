public class smallestDivisor {
  
  public int smallestDivisor(int[] nums, int threshold) {
        int ans = 0;
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++) end = Math.max(nums[i],end);
        while(start<=end){
            int mid = start+(end-start)/2;
            long sum = sumByDivisor(nums,mid) ;
            if(sum<=threshold){
                ans = mid;
                end = mid-1;
            } 
            else start = mid+1;
        }
        return ans;
    }

    public long sumByDivisor(int[] nums,int midDivisor){
        long sum = 0;
        for(int i = 0;i<nums.length;i++){
            int dividebyDivisor = (int)Math.ceil((double)nums[i]/midDivisor);
            sum += dividebyDivisor;
        }
        return sum;
    }
}
