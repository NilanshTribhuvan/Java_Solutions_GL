class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans= ArrayList<>();
        helper(candidates,target,0,ans)
        return ans;
    }
    void helper(int[] candidates,int target,int index,List<Integer> ans,int curr){
        if(index==candidates.length){
            if(target==0){
                ans.add();
                return ans;
            }
            if(target<0){
                return last place
            }
            curr.add(canditate[index])
            helper(candidates,target,index,ans,);
            curr.remove(ans.size()-1);
            helper(candidates,target,index+1,ans,)
        }
    }
}