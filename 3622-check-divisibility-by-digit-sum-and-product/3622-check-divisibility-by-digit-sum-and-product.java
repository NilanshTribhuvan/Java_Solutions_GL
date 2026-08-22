class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;

        for(int i=n;i>0;i/=10){
            int digit=i%10;

            sum+=digit;
            product*=digit;

        }
        return n%(sum+product)==0;
    }
}