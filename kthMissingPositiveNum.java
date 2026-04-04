public class kthMissingPositiveNum {
  
  public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int missingValues = arr[mid]-(mid+1);
            if(missingValues<k) start = mid+1;
            else end = mid-1;
        }
        return start+k; // or high+1+k
    }

    /* BETTER
    public int findKthPositive(int[] arr, int k) {
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<=k) k++;
            else break;
        }
        return k;
    } */

    /* brute 
    public int findKthPositive(int[] arr, int k) {
        int missing = 0;
        for(int i = 1;i<=k+arr.length;i++){
            int num = i;
            boolean found = false;
            for(int j = 0;j<arr.length;j++){
                if(i==arr[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                missing++;
                if(missing==k) return i;
            } 
            
        }
        return -1;
    } */
}
