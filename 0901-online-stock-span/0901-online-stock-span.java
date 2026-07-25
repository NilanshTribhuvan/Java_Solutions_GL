class StockSpanner {
        Stack<int[]> st;
        int ind;
        int[] arr;
    public StockSpanner() {
        st=new Stack<>();
        ind=-1;
    }
    
    public int next(int price) {
       ind=ind+1;
       while(!st.isEmpty() && st.peek()[1]<=price){
        st.pop();
       }
       int arr= ind-(st.isEmpty()?-1:st.peek()[0]);
    st.push(new int[]{ind,price});
    return arr;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */