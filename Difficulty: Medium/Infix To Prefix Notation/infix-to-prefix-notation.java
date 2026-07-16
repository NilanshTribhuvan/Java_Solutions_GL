class Solution {
    public String infixToPrefix(String s) {
        // code here
        int i=0;
        String r="";
        String ans = "";
        String fin="";
        Stack<Character> st=new Stack<>();
        for(int j=s.length()-1;j>=0;j--){
            if(s.charAt(j)=='('){
                r+=')';
            }else if(s.charAt(j)==')'){
                r+='(';
            }else{
                r+=s.charAt(j); 
            }
           
        }
        int n=r.length();
        while(i<n){
            if(r.charAt(i)>='A' && r.charAt(i)<='Z'||r.charAt(i)>='a' && r.charAt(i)<='z'||
            r.charAt(i)>='0' && r.charAt(i)<='9'){
                ans+=r.charAt(i);
            }else if(r.charAt(i)=='('){
                st.push(r.charAt(i));
            }else if(r.charAt(i)==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans+=st.peek();
                    st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && (priority(r.charAt(i))<priority(st.peek())||
                (priority(r.charAt(i))==priority(st.peek()) && r.charAt(i)=='^'))){
                    ans+=st.peek();
                    st.pop();
                }
                st.push(r.charAt(i));
            }
            i++;
        }
        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        for(int k=ans.length()-1;k>=0;k--){
               fin+=ans.charAt(k); 
        }
        return fin;
    }
    int priority(char ch){
        if(ch=='+'|| ch=='-'){
            return 1;
        }else if(ch=='*' || ch=='/'){
            return 2;
        }else if(ch=='^'){
            return 3;
        }
        return -1;
    }
    
}