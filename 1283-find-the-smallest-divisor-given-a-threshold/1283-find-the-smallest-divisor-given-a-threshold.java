class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high=0;
        for(int num:nums){
            high=Math.max(high,num);
        }
        return binary(nums,threshold,1,high);
    }
    public int binary(int[] nums, int threshold,int low,int high){
        if(low>high){
            return low;
        }
        int mid=low+(high-low)/2;
        if(thresh(nums,mid)<=threshold){
            return binary(nums,threshold,low,mid-1);
        }else{
            return binary(nums,threshold,mid+1,high);
        }
    }
    public int thresh(int[] nums,int d){
        int sum=0;
        for(int num:nums){
            sum+=Math.ceil((double)num/d);
        }
        return sum;
    }

}