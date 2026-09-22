class Solution {
    public List<Integer> getRow(int rowIndex) {
      return genetRow(rowIndex+1);
    }
    public List<Integer> genetRow(int n){
        List<Integer> ans=new ArrayList<>();
        long res=1;
        ans.add((int)res);
        for(int i=1;i<n;i++){
            res=res*(n-i);
            res=res/i;
            ans.add((int)res);
        }
        return ans;

    }
}