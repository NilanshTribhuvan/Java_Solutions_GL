class Solution {
    public void nextPermutation(int[] nums) {
       int indx = -1;

       for(int i=nums.length-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            indx=i;
            break;
        }}
        if(indx==-1){
            reverse(nums,0,nums.length-1);
            return;
        
       }
       for(int i=nums.length-1;i>=indx;i--){
        if(nums[i]>nums[indx]){
            swap(nums,i,indx);
            break;
        }}
       
       reverse(nums,indx+1,nums.length-1);
       }
       //helper reverse function
       void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start, end);
            start++;
            end--;
        }
       }
       //helper swap function
       void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
       }

        }
    
