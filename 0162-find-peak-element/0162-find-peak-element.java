class Solution {
    int f(int[] nums,int low,int high){
        if(low==high){
            return low;
        }
        int mid=(low+high)/2;
        
        if(nums[mid]<nums[mid+1]){
            return f(nums,mid+1,high);
        }else{
            return f(nums,low,mid);
        }
    }
    public int findPeakElement(int[] nums) {
        return f(nums,0,nums.length-1);
    }
}