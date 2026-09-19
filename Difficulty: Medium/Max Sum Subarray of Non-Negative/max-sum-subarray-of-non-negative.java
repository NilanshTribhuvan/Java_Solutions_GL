class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
    ArrayList<Integer> res=new ArrayList<>();
    int n=arr.length;
    int sum=0;
    int start=0;
    int maxst=-1;
    int maxend=-1;
    int maxsum=-1;
    for(int i=0;i<n;i++){
        if(arr[i]<0){
            sum=0;
            start=i+1;
            continue;
        }
        sum+=arr[i];
        if(sum>maxsum){
            maxsum=sum;
            maxst=start;
            maxend=i;
        }else if(sum==maxsum){
            int curr=i-start+1;
            int maxlen=maxend-maxst+1;
        
        if(curr>maxlen || curr==maxlen && start<maxst){
            maxst=start;
            maxend=i;
        }
        }
        }
         if(maxst==-1){
            res.add(-1);
            return res;
         }
         for(int i=maxst;i<=maxend;i++){
            res.add(arr[i]);
         }
         return res;
    }
}