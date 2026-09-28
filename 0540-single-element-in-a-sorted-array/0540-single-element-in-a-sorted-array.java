class Solution {
    int f(int[] nums,int low,int high){
        if(low==high){
            return nums[low];
        }
        int mid=(low+high)/2;
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
        if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
            return nums[mid];
        }
        
        if((mid%2==1 && nums[mid-1]==nums[mid])|| (mid%2==0 && nums[mid]==nums[mid+1])){
            return f(nums,mid+1,high);
        }else{
            return f(nums,low,mid-1);
        }
    }
    public int singleNonDuplicate(int[] nums) {
        return f(nums,0,nums.length-1);
    }
}