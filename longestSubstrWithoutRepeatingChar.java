package TwoPointers&SlidingWindow;

public class longestSubstrWithoutRepeatingChar {
  
  public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        while(r<n){
            char ch = s.charAt(r);
            // duplicate and present in current window
            if(map.containsKey(ch) && map.get(ch)>=l){ 
                int pastIdx = map.get(ch);
                l = pastIdx+1; // shrink window to avoid duplicate
            }
            map.put(ch,r);
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }

    /* BRUTE - O(N*2)
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        for(int i = 0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = i;j<n;j++){
                if(set.contains(s.charAt(j))) break; // duplicate found
                set.add(s.charAt(j));
                maxlen = Math.max(maxlen,j-i+1);
            }
        }
        return maxlen;
    } */
}
