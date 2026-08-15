class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int furthest=0;
        int curr=0;
        int jump=0;
        for(int i=0;i<n-1;i++){
            furthest=Math.max(furthest,i+nums[i]);
       
            if(i==curr){
                jump++;
                curr=furthest;
            }
        }
        return jump;
    }
}