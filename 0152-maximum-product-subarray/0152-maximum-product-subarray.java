class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=nums[0];
        int minprod=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int tempmax=maxprod;
            int tempmin=minprod;
            maxprod=Math.max(curr,Math.max(curr*tempmax,curr*tempmin));
            minprod=Math.min(curr,Math.min(curr*tempmax,curr*tempmin));
            ans=Math.max(ans,maxprod);
        }
        
        return ans;
    }
}