class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=cardPoints[i];
        }
        int sum=0;
        for(int i=0;i<n-k;i++){
            sum+=cardPoints[i];
        }
        int min=sum;
        for(int i=n-k;i<n;i++){
            sum+=cardPoints[i];
            sum-=cardPoints[i-(n-k)];
            min=Math.min(min,sum);
        }
        return total-min;
    }
}