class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        helper(k,n,ans,curr,1);
        return ans;
    }
    void helper(int k,int n,List<List<Integer>> ans,List<Integer> curr,int index){
        if(n==0 && curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(curr.size()>k){
            return;
        }
        if(n<0){
            return;
        }
        for(int i=index;i<=9;i++){
            
            curr.add(i);
            helper(k,n-i,ans,curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
}