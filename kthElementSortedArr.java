public class kthElementSortedArr {
  
  public int kthElement(int[] a, int[] b, int k) {
      if(a.length>b.length) return kthElement(b,a,k);
      int n1 = a.length; int n2 = b.length;
      int start = Math.max(0,k-n2);
      int end = Math.min(k,n1);
      while(start<=end){
        int cut1 = (start+end)/2; // elements from a
        int cut2 = k-cut1; // element from b
        int l1 = (cut1==0) ? Integer.MIN_VALUE : a[cut1-1];
        int l2 = (cut2==0) ? Integer.MIN_VALUE : b[cut2-1];
        int r1 = (cut1==n1) ? Integer.MAX_VALUE : a[cut1];
        int r2 = (cut2==n2) ? Integer.MAX_VALUE : b[cut2];
        if(l1<=r2 && l2<=r1) return Math.max(l1,l2);
        else {
            if(l1>r2) end = cut1-1;
            else start = cut1+1;
        }
      }
      return -1;
    }
}
