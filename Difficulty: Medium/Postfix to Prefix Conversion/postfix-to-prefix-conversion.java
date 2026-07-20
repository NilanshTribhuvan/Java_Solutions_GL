class Solution {
    static String postToPre(String s) {
        // code here
        int n=s.length();
        int i=0;
        
        Stack<String> st=new Stack<>();
        while(i<n){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' ||
            s.charAt(i)>='a' && s.charAt(i)<='z'|| s.charAt(i)>='0' && s.charAt(i)<='9'){
                st.push(s.charAt(i)+"");
            }else{
                String t1=st.peek(); st.pop();
                String t2=st.peek(); st.pop();
                String ans=s.charAt(i)+t2+t1;
                st.push(ans);
            }
            i++;
        }
        return st.peek();
    }
}
