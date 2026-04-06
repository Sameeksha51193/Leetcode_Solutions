public class medianSortedArr {
  
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length<nums1.length) return findMedianSortedArrays(nums2, nums1);
        int n1 = nums1.length; 
        int n2= nums2.length;
        int start = 0;
        int end = n1;
        while(start<=end){
            int cut1 = (start+end)/2; // elements from nums1
            int cut2 = (n1+n2+1)/2-cut1; // elements from nums2
            int l1 = (cut1==0) ? Integer.MIN_VALUE : nums1[cut1-1];
            int l2 = (cut2==0) ? Integer.MIN_VALUE : nums2[cut2-1];
            int r1 = (cut1==n1) ? Integer.MAX_VALUE : nums1[cut1];
            int r2 = (cut2==n2) ? Integer.MAX_VALUE : nums2[cut2];
            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2==0) return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                else return Math.max(l1,l2);
            }
            else{
                if(l1>r2) end = cut1-1;
                else start = cut1+1;
            }
        }
        return -1;
    }

    /* BETTER - O(m*n), O(1)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length; int n2= nums2.length;
        int n = n1+n2;
        int idx1 = n/2; int idx2 = idx1-1;
        int ele1 = -1; int ele2 = -1;
        int i = 0; int j = 0; int count = 0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                int val = nums1[i++];
                if(count==idx1) ele1 = val;
                if(count==idx2) ele2 = val;
                count++;
            }
            else if(nums1[i]>=nums2[j]){
                int val = nums2[j++];
                if(count==idx1) ele1 = val;
                if(count==idx2) ele2 = val;
                count++;
            }
        }
        while(i<n1){
            int val = nums1[i++];
            if(count==idx1) ele1 = val;
            if(count==idx2) ele2 = val;
            count++;
        }
        while(j<n2){
            int val = nums2[j++];
            if(count==idx1) ele1 = val;
            if(count==idx2) ele2 = val;
            count++;
        }
        if(n%2==1) return ele1;
        return (ele1+ele2)/2.0;
    } */

    /* BRUTE - O(m+n), O(m+n)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = mergeArr(nums1, nums2);
        int len = merge.length;
        if(len%2==1) return merge[len/2];
        else return (merge[len/2]+merge[len/2-1])/2.0;
    }

    public int[] mergeArr(int[] nums1, int[] nums2){
        int[] ans = new int[nums1.length+nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]) ans[k++] = nums1[i++];
            else if(nums1[i]>nums2[j]) ans[k++] = nums2[j++];
            else{
                ans[k++] = nums1[i++];
                ans[k++] = nums2[j++];
            }
        }
        while(i<nums1.length) ans[k++] = nums1[i++];
        while(j<nums2.length) ans[k++] = nums2[j++];
        return ans;
    } */
}
