class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        long start = intervals[0][0];
        long end = intervals[0][1];
        long activeTime = 0;
        for(int i = 1;i<intervals.length;i++){
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];
            if(currStart <= end) end = Math.max(end, currEnd);
            else{
                activeTime += end-start+1;
                start = currStart;
                end = currEnd;
            }
        }
        activeTime += end-start+1;
        long bulbNeeded = (brightness+2L)/3;
        return bulbNeeded*activeTime;
    }
}