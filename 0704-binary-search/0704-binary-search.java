class Solution {
     int f(int[] nums,int low, int high,int target){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
           return f(nums,mid+1,high,target);
        }
        return f(nums,low,mid-1,target);
     }
    public int search(int[] nums, int target) {
       return f(nums,0,nums.length-1,target);
    }
}