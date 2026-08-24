class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int sum=0;
        int start=0;
        int maxsum=-1;
        int maxstart=-1;
        int maxend=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                sum=0;
                start=i+1;
                continue;
            }
             sum+=arr[i];
            if(sum>maxsum){
                maxsum=sum;
                maxstart=start;
                maxend = i;
            }else if(sum==maxsum){
                int curr=i-start+1;
                int maxlen=maxend-maxstart+1;
            
            if(curr>maxlen){
                maxstart=start;
                maxend=i;
            }
            }
        }
        if(maxstart==-1){
            result.add(-1);
            return result;
        }
        for(int i=maxstart;i<=maxend;i++){
            result.add(arr[i]);
        }
        return result;
    }
}