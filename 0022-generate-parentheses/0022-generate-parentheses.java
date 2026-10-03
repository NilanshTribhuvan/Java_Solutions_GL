class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate(n,0,"",0,0,ans);
        return ans;
    }
    public void generate(int n,int index,String currstr,int open,int close, List<String> ans){
        if(index==2*n){
            ans.add(currstr);
            return;
        }
        if(open<n){
            generate(n,index+1,currstr+"(",open+1,close,ans);
        }
        if(close<open){
            generate(n,index+1,currstr+")",open,close+1,ans);
        }
    }
}