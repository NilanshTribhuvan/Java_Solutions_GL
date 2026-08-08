class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        for(int i=(k-2)/2;i>=0;i--){
             heapify(nums,i,k);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]>nums[0]){
                int temp= nums[i];
                nums[i]=nums[0];
                nums[0]=temp;
                heapify(nums,0,k);
            }
            
        }
       return nums[0];
        
    }
    public void heapify(int[] nums,int i,int n){
        
        int smallest = i;
        int left =2*i+1;
        int right = 2*i+2;

        if(left<n && nums[smallest]>nums[left]){
            smallest=left;
        }
        if(right<n && nums[smallest]>nums[right]){
            smallest=right;
        }
        if(smallest!=i){
            int temp=nums[smallest];
            nums[smallest]=nums[i];
            nums[i]=temp;

        heapify(nums,smallest,n) ;
        }
    }

}