class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a, b) -> a[0] - b[0]);
        List<int[]> result=new ArrayList<>();
        result.add(intervals[0]);
        int i=1;

        while(i<n){
            int[] curr=intervals[i];
            int[] last=result.get(result.size()-1);
            if(curr[0]<=last[1]){
                last[1]=Math.max(curr[1],last[1]); 
            }else{
                result.add(intervals[i]);
            }
            i++;

        }
        return result.toArray(new int[result.size()][]);
    }
}