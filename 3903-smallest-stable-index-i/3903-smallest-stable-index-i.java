class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] suffmin=new int[n];
        suffmin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffmin[i]=Math.min(nums[i],suffmin[i+1]);
        }
        int prefixmax=nums[0];
        for(int i=0;i<n;i++){
            prefixmax=Math.max(prefixmax,nums[i]);
            int instability= prefixmax-suffmin[i];
            if(instability<=k){
                return i;
            }
        }
        return -1;
    }
}