class Solution {
    public static String infixToPostfix(String s) {
        // code here
        int i=0;
        String ans="";
        Stack<Character> st=new Stack<>();
        int n=s.length();
        while(i<n){
        if(s.charAt(i)>='A' && s.charAt(i)<='Z'||s.charAt(i)>='a' && s.charAt(i)<='z'||
        s.charAt(i)>='0' && s.charAt(i)<='9'){
            ans=ans+s.charAt(i);
        }else if(s.charAt(i)=='('){
            st.push(s.charAt(i));
        }else if(s.charAt(i)==')'){
            while(!st.isEmpty() && st.peek()!='('){
            ans+=st.peek();
            st.pop();
            }
            st.pop();
        }
        else{
            while(!st.isEmpty() && (priority(s.charAt(i))<priority(st.peek())
            || (priority(s.charAt(i))==priority(st.peek()) && s.charAt(i)!='^'))){
                ans=ans+st.peek();
                st.pop();
            }
            st.push(s.charAt(i));
        }
        i++;
        }
        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        return ans;
    }
    static int priority(char ch){
       if (ch == '+' || ch == '-') {
        return 1;
    } else if (ch == '*' || ch == '/') {
        return 2;
    } else if (ch == '^') {
        return 3;
    }
    return -1;
    }
}