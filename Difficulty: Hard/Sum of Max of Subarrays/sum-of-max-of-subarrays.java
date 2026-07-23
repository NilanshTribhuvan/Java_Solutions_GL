class Solution {
    public int sumOfMax(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> st =new Stack<>();
        int[] pge=new int[n];
        int[] nge=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
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
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
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
            sum+=(left*right*arr[i]);
        }
        return (int)sum;
    }
}