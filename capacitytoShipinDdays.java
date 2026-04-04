public class capacitytoShipinDdays {
  
  public int shipWithinDays(int[] weights, int days) {
        int ans = 0;
        int start = 1;
        int end = 0;
        for(int i = 0;i<weights.length;i++){
            start = Math.max(start,weights[i]);
            end += weights[i];
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            int requiredDays = daysTaken(weights, mid);
            if(requiredDays<=days){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }

    public int daysTaken(int[] weights, int midCapacity){
        int days = 1;
        int weight = 0;
        for(int i = 0;i<weights.length;i++){
            weight += weights[i];
            if(weight>midCapacity){
                days++;
                weight = weights[i];
            }
        }
        return days;
    }
}
