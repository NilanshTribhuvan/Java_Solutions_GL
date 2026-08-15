class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int furthest=0;
        for(int i=0;i<n;i++){
            if(i>furthest){
                return false;
            }
            furthest=Math.max(furthest,i+nums[i]);

            if(furthest>=nums.length-1){
                return true;
            }

        }
        return true;

    }
}