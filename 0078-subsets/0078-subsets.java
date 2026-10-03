class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        generate(0,nums,new ArrayList<>(),ans);
        return ans;
    }
    public void generate(int index,int[] nums, List<Integer> res,List<List<Integer>> ans){
        
        if(index==nums.length){
            ans.add(new ArrayList<>(res));
            return;
        }

        res.add(nums[index]);
        generate(index+1,nums,res,ans);

        res.remove(res.size()-1);

        generate(index+1,nums,res,ans);
    }
}