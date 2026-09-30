class Solution {
    int s(int[] nums,int k, int p){
        int r=0,painter=1;
        for(int i=0;i<nums.length;i++){
            if(r+nums[i]<=p){
                r+=nums[i];
            }else{
                painter=painter+1;
                r=nums[i];
            }
        }
        return painter;
    }

    public int splitArray(int[] nums, int k) {
        int ans=0;
        int low=Arrays.stream(nums).max().getAsInt();
        int high=Arrays.stream(nums).sum();
        while(low<=high){
            int mid=(low+high)/2;
            if(s(nums,k,mid)<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}