class Solution {
    private final long mod=1000000007;
    public int countGoodNumbers(long n) {

        long even=(n+1)/2;
        long odd=n/2;
        long evenp=power(5,even);
        long oddp=power(4,odd);
        return (int) ((evenp*oddp)%mod);
    }
    public long power(long base,long n){
        if(n==0) return 1;
        if(n%2==0){
           return power((base*base)%mod,n/2);
        }else{
            return (base*power(base,n-1))%mod;
        }
    }
}