public class nthRootnNmber {
  
  public int NthRoot(int N, int M) {
        int start = 1;
        int end = M;
        while(start<=end){
            int mid = start+(end-start)/2;
            long val = power(mid,N,M);
            if(val==M) return mid;
            else if(val>M) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }

    public long power(int mid,int N,int M){
        long val = 1;
        for(int i = 1;i<=N;i++){
            val *= mid;
            if(val>M) return val; // val>M will never answer, prevents overflow
        }
        return val;
    }
}
