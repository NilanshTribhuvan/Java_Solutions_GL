class Solution {
    int f(int[] nums,int low, int high,int target,int ans){
        if(low>high){
            return ans;
        }
        int mid=(low+high)/2;
        if(nums[mid]>=target){
            return f(nums,low,mid-1,target,mid);
        }
        return f(nums,mid+1,high,target,ans);
    }
    public int searchInsert(int[] nums, int target) {
        return f(nums,0,nums.length-1,target,nums.length);
    }
}