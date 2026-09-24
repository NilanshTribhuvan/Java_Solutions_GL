class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    public void merge(int[] nums,int low,int mid,int high){
        ArrayList<Integer> r=new ArrayList<>();
        
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){ 
                 r.add(nums[left++]);
                 }
            else{
                r.add(nums[right++]);
                
                }

          
        }
        while(left<=mid){
            r.add(nums[left++]);
        }
        while(right<=high){
            r.add(nums[right++]);
        }

        for(int i=low;i<=high;i++){
            nums[i]=r.get(i-low);
        }
        

    }
    public int countPairs(int[] nums,int low,int mid,int high){
        int cnt=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && nums[i]>2L*nums[right])
                right++;
               
            
             cnt+=right-(mid+1);

        }
        return cnt;
    }
    public int mergeSort(int[] nums,int low,int high){
        int cnt=0;
        if(low>=high) return cnt;
        int mid=(low+high)/2;
        cnt+=mergeSort(nums,low,mid);
        cnt+=mergeSort(nums,mid+1,high);
         cnt+=countPairs(nums,low,mid,high);
       merge(nums,low,mid,high);
        return cnt;
    }
}