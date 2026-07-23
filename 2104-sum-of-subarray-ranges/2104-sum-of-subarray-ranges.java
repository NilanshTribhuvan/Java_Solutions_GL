class Solution {
    public long subArrayRanges(int[] nums) {
        return large(nums)-small(nums);        
    }

    private long small(int[] nums){
        int n=nums.length;
        Stack<Integer> st =new Stack<>();
        int[] pse=new int[n];
        int[] nse=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()] > nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            sum+=(left*right*nums[i]);
        }
        return sum;
    }
    private long large(int[] nums){
        int n=nums.length;
        Stack<Integer> st =new Stack<>();
        int[] pge=new int[n];
        int[] nge=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pge[i]=-1;
            }else{
                pge[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=n;
            }else{
                nge[i]=st.peek();
            }
            st.push(i);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            long left=i-pge[i];
            long right=nge[i]-i;
            sum+=(left*right*nums[i]);
        }
        return sum;
    }

}