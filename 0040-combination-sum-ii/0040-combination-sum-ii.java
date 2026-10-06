class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,ans,curr,0);
        
        return ans;
    }
    void helper(int[] candidates,int target, List<List<Integer>> ans, List<Integer> curr,int index){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(index==candidates.length){
            return;
        }
        if(target<0){
            return;
        }
        
        //for(int i=index;i<candidates.length;i++){
        //    if(i>index && candidates[i]==candidates[i-1]){
        //    continue;
        //}
        curr.add(candidates[index]);
        helper(candidates,target-candidates[index],ans,curr,index+1);
        curr.remove(curr.size()-1);
        int next=index+1;
        while(next<candidates.length && candidates[next]==candidates[index]){
            next++;
        }
        helper(candidates,target,ans,curr,next);

      //  }
    }
}