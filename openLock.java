class Pair{
    String first; int second;
    Pair(String first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> st = new HashSet<>();
        Set<String> visited = new HashSet<>();
        for(int i = 0;i<deadends.length;i++) st.add(deadends[i]);
        if(st.contains("0000")) return -1;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair("0000",0));
        visited.add("0000");
        while(!q.isEmpty()){
            Pair curr = q.poll();
            String word = curr.first;
            int steps = curr.second;
            if(word.equals(target)) return steps;
            for(int i = 0;i<word.length();i++){
                char[] charArr = word.toCharArray();

                // forward rotation
                charArr[i] = (char)((charArr[i]-'0'+1)%10+'0'); // 9 +1 = 10 % 10 = 0
                String forward = new String(charArr);
                if(!st.contains(forward) && !visited.contains(forward)){
                    visited.add(forward);
                    q.offer(new Pair(forward,steps+1));
                }

                charArr = word.toCharArray();
                // backward rotation
                charArr[i] = (char)((charArr[i]-'0'+9)%10+'0');
                String backward = new String(charArr);
                if(!st.contains(backward) && !visited.contains(backward)){
                    visited.add(backward);
                    q.offer(new Pair(backward,steps+1));
                }
            }
        }
        return -1;
    }
}
