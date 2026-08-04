class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    private int atmost(int[] nums, int k){
        if(k<0) return 0;
        int l=0;
        int ans=0;
        int count=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2!=0){
                ans++;
            }
            while(ans>k){
                if(nums[l]%2!=0){
                    ans--;
                }
                l++;
            }
            
            count+=r-l+1;
        }
        return count;
    }
}