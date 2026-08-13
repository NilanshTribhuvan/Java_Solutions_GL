class Solution {
    private int sumOfEle(int n){
        int sum=0;
        while(n>0){
        sum+=(n%10);
        n=n/10;
        }
        return sum;
    } 
    int mini=Integer.MAX_VALUE;
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int x=sumOfEle(nums[i]);
            mini=Math.min(mini,x);
        }
        return mini;
    }
}