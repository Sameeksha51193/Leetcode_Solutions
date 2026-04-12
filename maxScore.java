package TwoPointers&SlidingWindow;

public class maxScore {
  
  public int maxScore(int[] cardPoints, int k) {
        // TC - O(2K), O(1)
        int lSum = 0;
        for(int i = 0;i<=k-1;i++) lSum += cardPoints[i];
        int rSum = 0;
        int score = 0;
        int maxScore = lSum;
        int rIdx = cardPoints.length-1;
        for(int i = k-1;i>=0;i--){
            lSum -= cardPoints[i];
            rSum += cardPoints[rIdx];
            rIdx--;
            score = lSum+rSum;
            maxScore = Math.max(score,maxScore);
        }
        return maxScore;
    }

}
