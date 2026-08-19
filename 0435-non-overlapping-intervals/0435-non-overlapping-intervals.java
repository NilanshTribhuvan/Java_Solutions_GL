class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a, b) -> a[1] - b[1]);
        int cnt=0;
        int i=1;
        int end=intervals[0][1];

        while(i<n){
           
            if(intervals[i][0]<end){
                cnt++;

            }else{
                end=intervals[i][1];
                
            }
            i++;

        }
        return cnt;
    }
}