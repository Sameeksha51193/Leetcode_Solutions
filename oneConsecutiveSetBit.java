class Solution {
    public boolean consecutiveSetBits(int n) {
        StringBuilder bStr = new StringBuilder();
        while(n > 0){
            bStr.append(n%2);
            n = n/2;
        }

        int cnt = 0;
        for(int i = 0;i<bStr.length()-1;i++){
            if(bStr.charAt(i) == '1' && bStr.charAt(i+1) == '1') cnt++;
        }
        if(cnt == 1) return true;
        return false;
    }
}