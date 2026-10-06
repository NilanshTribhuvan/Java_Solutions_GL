class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        generate(candidates,target,0,ans,res);
        return ans;
    }
    public void generate(int[] candidates,int target,int index,List<List<Integer>> ans,List<Integer> res){
        if(target==0){
            ans.add(new ArrayList<>(res));
            return;
        }
        if(index==candidates.length){
            return;
        }
        if(target<0){
            return;
        }
        res.add(candidates[index]);
        generate(candidates,target-candidates[index],index,ans,res);
        res.remove(res.size()-1);
        generate(candidates,target,index+1,ans,res);
    }
}