class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' '){
                i++;
            }
         int sign=1;
            if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
                if(s.charAt(i)=='-'){
                    sign=-1;
                }
                i++;
                
        }
        return conversion(s,sign,i,0);
        }
        public int conversion(String s,int sign,int i,int result){
            if(i>=s.length() || !Character.isDigit(s.charAt(i))){
                return sign * result;
            }
            int digit = s.charAt(i)-'0';
            if(result>(Integer.MAX_VALUE-digit)/10){
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;

            }
            result=result*10+digit;
            return conversion(s,sign,i+1,result);
        }
        
    }
