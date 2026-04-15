package Arrays;

import java.util.ArrayList;

public class union2SortedArr {
  
  public int[] unionArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                if(list.size()==0 || list.get(list.size()-1)!=nums1[i]){ //avoidDuplicate
                    list.add(nums1[i]);
                }
                i++;
            }
            else if (nums1[i]>nums2[j]){
                if(list.size()==0 || list.get(list.size()-1)!=nums2[j]){
                    list.add(nums2[j]);
                }
                j++;
            }
            else{
                if(list.size()==0 || list.get(list.size()-1)!=nums1[i]){
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n){
            if(list.size()==0 || list.get(list.size()-1)!=nums1[i]){
                list.add(nums1[i]);
            }
            i++;
        }
        while(j<m){
            if(list.size()==0 || list.get(list.size()-1)!=nums2[j]){
                list.add(nums2[j]);
            }
            j++;
        }
        int[] ans = new int[list.size()];
        int k = 0;
        for(int val:list) ans[k++] = val;
        return ans;
    }

    /* public int[] unionArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Set<Integer> set = new HashSet<>();
        for(int num:nums1) set.add(num);
        for(int num:nums2) set.add(num);
        int[] ans = new int[set.size()];
        int i = 0;
        for(int val:set){
            ans[i++] = val;
        }
        Arrays.sort(ans);
        return ans;
    } */
}
