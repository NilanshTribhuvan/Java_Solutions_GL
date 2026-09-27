class Solution {
    int f(int[] nums,int low,int high, int ans){
        if(low>high){
            return ans;
        }
         int mid=(low+high)/2;
            
            if(nums[low]<=nums[mid]){
                ans=Math.min(ans,nums[low]);
                return f(nums,mid+1,high,ans);
            }else{
                ans=Math.min(ans,nums[mid]);
                return f(nums,low,mid-1,ans);
            }
        
    }
    public int findMin(int[] nums) {
        return f(nums,0,nums.length-1,Integer.MAX_VALUE);
    }
}