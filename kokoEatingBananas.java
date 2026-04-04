public class kokoEatingBananas {
  
  public int minEatingSpeed(int[] piles, int h) {
        int ans = 0;
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int i = 0;i<piles.length;i++){
            end = Math.max(piles[i],end);
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            long requiredhours = totalHours(piles,mid);
            if(requiredhours<=h){
                ans = mid;
                end = mid-1; // minimize speed
            }
            else start = mid+1;
        }
        return ans;

    }

    public long totalHours(int[] piles, int mid){
        long hours = 0;
        for(int i = 0;i<piles.length;i++){
            hours += (int)Math.ceil((double)piles[i]/mid);
        }  
        return hours;
    }
}
