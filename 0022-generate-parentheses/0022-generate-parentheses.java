class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate(n,0,"",0,0,ans);
        return ans;
    }
    public void generate(int n, int index , String s, int open,int closed,List<String> ans){
        if(index==2*n){
            ans.add(s);
            return;
        }
        if(open<n){
            generate(n,index+1,s+"(",open+1,closed,ans);
        }
         if(closed<open){
            generate(n,index+1,s+")",open,closed+1,ans);
         }
    }
}