class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int total=0;
        for(int x:cardPoints){
            total+=x;
        }
        if(total==k){
            return total;
        }
        int windowsum=0;
        for(int i=0;i<n-k;i++){
            windowsum+=cardPoints[i];
        }
        int minisum=windowsum;
        for(int i=n-k;i<n;i++){
            windowsum+=cardPoints[i];
            windowsum-=cardPoints[i-(n-k)];
            minisum=Math.min(minisum,windowsum);
        }
        return total-minisum;
    }
}