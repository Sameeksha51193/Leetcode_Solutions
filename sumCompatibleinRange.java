class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
        // range : n-k <= x <= n+k
        int left = Math.max(n-k,1);
        int right = n+k;
        for(int x = left;x<=right;x++){
            if((n & x) == 0) sum += x;
        }
        return sum;
    }
}
