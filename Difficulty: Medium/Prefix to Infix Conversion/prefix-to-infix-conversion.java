class Solution {
    static String preToInfix(String s) {
        // code here
        int n =s.length();
        int i =n-1; 
        Stack<String> st =new Stack<>();
        String ans="";
        while(i>=0){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' ||
            s.charAt(i)>='a' && s.charAt(i)<='z'||s.charAt(i)>='0' && s.charAt(i)<='9'){
                st.push(String.valueOf(s.charAt(i)));
            }else{
                String t1=st.peek(); st.pop();
                String t2=st.peek(); st.pop();
                ans="("+t1+s.charAt(i)+t2+")";
                st.push(ans);
            }
            i--;
        }
        return ans;
    }
}
 