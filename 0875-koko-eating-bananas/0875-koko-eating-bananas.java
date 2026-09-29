class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;
        for(int num:piles){
            high=Math.max(high,num);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nofb(piles,mid)<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public int nofb(int[] piles,int d){
        int sum=0;
        for(int num:piles){
            sum+=(Math.ceil((double)num/d));
        }
        return sum;
    }
}