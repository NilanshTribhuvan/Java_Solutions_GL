class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarrays(nums,k)-subarrays(nums,k-1);
    }
    private int subarrays(int[] nums, int k){
        int l=0;
        int unique=0;
        int count=0;
        int[] freq=new int[nums.length+1];

        for(int r=0;r<nums.length;r++){
            if(k<0) return 0;
            if(freq[nums[r]]==0){
                unique++;
            }
            freq[nums[r]]++;
            while(unique>k){
                freq[nums[l]]--;
                if(freq[nums[l]]==0){
                    unique--;
                }
                l++;
            }
            count +=r-l+1;
        }
        return count;
    }
}