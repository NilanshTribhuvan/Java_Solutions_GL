class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = 0;
        int high=0;
        int res=-1;
        for(int num:bloomDay){
            low=Math.min(low,num);
        }
        for(int num:bloomDay){
            high=Math.max(high,num);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(bloom(bloomDay,mid, m, k)>=m){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
    public int bloom(int[] bloomDay,int day, int m, int k){
        int cnt=0,total=0;
        for(int num:bloomDay){
            if(num<=day){
                cnt++;
            }else{
                total+=cnt/k;
                cnt=0;
            }
        }
        total+=cnt/k;
        return total;
    }
}