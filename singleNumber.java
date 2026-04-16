package Arrays;

public class singleNumber {
  
  // OPTIMAL - O(n),O(1)
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for(int i = 0;i<n;i++) xor ^= nums[i];
        return xor;
    }

    /*BETTER - O(2n),O(n)
    public int singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums) map.put(num,map.getOrDefault(num,0)+1);
        for(int i = 0;i<n;i++){
            if(map.get(nums[i])==1) return nums[i];
        }
        return -1;
    } */

    /* BRUTE - O(n^2),O(1)
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int freq = 0;
            for(int j = 0;j<n;j++){
                if(nums[i]==nums[j]) freq++;
            }
            if(freq==1) return nums[i];
        }
        return -1;
  } */
 
}
