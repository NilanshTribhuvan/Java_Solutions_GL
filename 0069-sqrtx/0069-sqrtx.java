class Solution {
    public int mySqrt(int x) {
        long ans=1;
        if(x==0) return 0;
        for(int i=0;i<=x;i++){
            if((long)i*i<=x){ 
                ans=i;
            }else{
                break;
            }
        }
        return (int)ans;
    }
}