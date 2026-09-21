class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        int positive=0;
        int negative=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                a[positive]=nums[i];
                positive+=2;
            }else{
                a[negative]=nums[i];
                negative+=2;
            }
        }
        return a;

    }
}