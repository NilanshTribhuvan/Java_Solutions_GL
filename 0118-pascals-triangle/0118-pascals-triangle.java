class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRows(i));
        }
        return ans;

    }
    public static List<Integer> generateRows(int n){
        List<Integer> answer= new ArrayList<>();
        int res=1;
        answer.add(1);
        for(int i=1;i<n;i++){
            res=res*(n-i);
            res=res/i;
            answer.add(res);

        }
        return answer;

}
}
