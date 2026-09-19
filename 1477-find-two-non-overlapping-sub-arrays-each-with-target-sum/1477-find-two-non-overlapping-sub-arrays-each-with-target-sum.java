class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
        int i=0,j=0;
        int ind=Integer.MAX_VALUE;
        int[] minindx=new int[n];
        int bestmin=ind;
        int result=ind;
        int sum=0;
        for(int k=0;k<n;k++){
            minindx[k]=ind;
        }
        while(j<n){
            sum+=arr[j];
            while(i<j && sum>target){
                sum=sum-arr[i];
                i++;
            }
            if(sum==target){
                int len=j-i+1;
                if(i>0 && minindx[i-1]!=ind){
                    result=Math.min(result,len+minindx[i-1]);
                }
                bestmin=Math.min(bestmin,len);
            }
            minindx[j]=bestmin;
           j++;
        }
        if(result!=ind){
            return result;
        }else{
            return -1;
        }
    }
}