package Arrays;

public class missingNumber {
  
  public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0;i<n;i++){
            xor1 ^= (i+1);
            xor2 ^= nums[i];
        }
        return xor1^xor2;
    }

    /* OPTIMAL
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalsum = n*(n+1)/2;
        int sum = 0;
        for(int i = 0;i<n;i++) sum+= nums[i];
        return totalsum-sum;
    } */

    /* BETTER
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int num:nums) set.add(num);
        for(int i = 0;i<=n;i++){
            if(!set.contains(i)) return i; 
        }
        return -1;
    } */

    /* BRUTE 
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<=n;i++){
            boolean found = false;
            for(int j = 0;j<n;j++){
                if(i==nums[j]) {
                    found = true;
                    break;
                }
            }
            if(found==false) return i;
        }
        return -1;
    } */
}
