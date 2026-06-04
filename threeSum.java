class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            // skip duplicates for i
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    // skip duplicate for left
                    while(left<right && nums[left]==nums[left-1]) left++;
                    // skip duplicate for right
                    while(left<right && nums[right]==nums[right+1]) right--;
                }
                else if(sum<0) left++;
                else right--;
            } 
        }
        return ans;
    }

    /* BETTER
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            HashSet<Integer> set2 = new HashSet<>();
            for(int j = i+1;j<nums.length;j++){
                int third = -(nums[i] + nums[j]);
                if(set2.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp); 
                    set.add(temp);
                }
                set2.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    } */

    /* BRUTE
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0 ){
                       List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                       Collections.sort(temp);
                       set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    } */
}