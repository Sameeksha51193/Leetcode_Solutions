public class minDaysforMbouquets {
  
  public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length) return -1;
        int ans = -1;
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for(int i = 0;i<bloomDay.length;i++){
            start = Math.min(bloomDay[i],start);
            end = Math.max(bloomDay[i],end);
        } 
        while(start<=end){
            int mid = start+(end-start)/2;
            int bouquets = madeBouquets(mid,bloomDay,k);
            if(bouquets>=m) {
                ans = mid; 
                end = mid-1; // try smaller
            }
            else start = mid+1;
        }
        return ans;
    }

    public int madeBouquets(int middays,int[] bloomDay,int k){
        int bouquets = 0;
        int count = 0;
        for(int i = 0;i<bloomDay.length;i++){
            if(bloomDay[i]<=middays){
                count++;
                if(count==k){
                    bouquets++;
                    count = 0;
                }
            }
            else count = 0;
        }
        return bouquets;
    }
}
