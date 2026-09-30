class Solution {
    int f(int[] weights,int cap){
        int days=1,result=0;
        for(int i=0;i<weights.length;i++){
            if(result+weights[i]>cap){
                days=days+1;
                result=weights[i];
            }
            else{
                result+=weights[i];
            }

        }
        return days;

    }
    public int shipWithinDays(int[] weights, int days) {
        int max=Arrays.stream(weights).max().getAsInt();
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        int low = max,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(f(weights,mid)<=days){
                high=mid-1;
                
            }else{
                low=mid+1;
            }

        }

        return low;
    }
}