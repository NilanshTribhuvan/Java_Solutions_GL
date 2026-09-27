class Solution {
    int f(int[]nums,int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(nums[mid]==target) return mid;
        if(nums[low]<=nums[mid]){
        if(target >=nums[low] && target<=nums[mid]){
            return f(nums,low,mid-1,target);
        }else{
            return f(nums,mid+1,high,target);
        }
    }
    else{
        if(target>=nums[mid] && target<=nums[high]){
            return f(nums,mid+1,high,target);
        }else{
            return f(nums,low,mid-1,target);
        }
    }
    }
    public int search(int[] nums, int target) {
        
        return f(nums,0,nums.length-1,target);
    }
}