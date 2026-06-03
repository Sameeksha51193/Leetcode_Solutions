class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int idx = 0;idx<n;idx++) map.put(nums[idx],idx);
        for(int i = 0;i<n;i++){
            int remainder = target-nums[i];
            if(map.containsKey(remainder) && i!=map.get(remainder)){
                return new int[] {i,map.get(remainder)};
            } 
        }
        return new int[] {-1,-1};
    }

    /* public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int sum = nums[i]+nums[j];
                if(sum==target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    } */
}