class Solution {
    public double myPow(double x, int n) {
        long nn=n;
        if(nn<0){
            nn=-nn;
            return 1.0/cal(x,nn);
        }
        return cal(x,nn);
    }
    public double cal(double x , long nn){
        if(nn==0 || x==1) return 1;
        if(nn%2==0){
            return cal(x*x,nn/2);
        }else{
            return x*cal(x,nn-1);
        }
    }
}