class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character> st=new Stack<>();
        String res="";
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && k>0 && (st.peek())>(num.charAt(i))){
                st.pop();
                k=k-1;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        } 
        if(st.isEmpty()) return "0";
        while(!st.isEmpty()){
            res=st.peek()+res;
            st.pop();
        }
        
        while(res.length()>1 && res.charAt(0)=='0'){
            res=res.substring(1);
        }
        
        return res;
    }
}