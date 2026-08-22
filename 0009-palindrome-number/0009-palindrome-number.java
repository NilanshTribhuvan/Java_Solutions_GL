class Solution {
    public boolean isPalindrome(int x) {
        
        int r=0;
        int o=x;
        while(x>0){
            int lastsum=x%10;
            r=r*10+lastsum;
            x=x/10;
        }
        if(r==o){
            return true;
        }else{
            return false;
        }
    }
}