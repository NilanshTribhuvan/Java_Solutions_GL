class MinStack {
    Stack<Integer> st;
    Stack<Integer> s;
    public MinStack() {
        st=new Stack<>();
        s=new Stack<>();
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            st.push(value);
            s.push(value);
        }else{
            st.push(value);
            int min=Math.min(s.peek(),value);
            s.push(min);
        }

    }
    
    public void pop() {
        st.pop();
        s.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return s.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */