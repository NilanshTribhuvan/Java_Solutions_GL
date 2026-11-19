class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                tmax = smax;
                smax = max;
                max = nums[i];
            }else if(nums[i]<max && nums[i]>smax){
                tmax=smax;
                smax=nums[i];
            }else if(nums[i]<smax && nums[i]>tmax){
                tmax=nums[i];
            }
        }
        if(tmax==Long.MIN_VALUE){
            return (int) max;
        }else{
            return (int)tmax;
        }
    }
}