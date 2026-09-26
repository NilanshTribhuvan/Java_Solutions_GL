class Solution {
    int lb(int[] nums,int low,int high,int target, int ans){
        if(low>high){
         return ans;
        }
        int mid=(low+high)/2;
        if(nums[mid]>=target){
            return lb(nums,low,mid-1,target,mid);
        }
        return lb(nums,mid+1,high,target,ans);

    }
    int up(int[] nums,int low,int high,int target, int ans){
        if(low>high){
         return ans;
        }
        int mid=(low+high)/2;
        if(nums[mid]>target){
            return up(nums,low,mid-1,target,mid);
        }
        return up(nums,mid+1,high,target,ans);

    }
    public int[] searchRange(int[] nums, int target) {
        int lb=lb(nums,0,nums.length-1,target,nums.length);
        if(lb==nums.length|| nums[lb]!=target) return new int[]{-1,-1};
        return new int[]{lb,up(nums,0,nums.length-1,target,nums.length)-1};
    }
}