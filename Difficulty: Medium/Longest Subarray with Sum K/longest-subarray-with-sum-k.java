class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
       int sum=0;
       int maxlen=0;
       for(int i=0;i<n;i++){
           sum+=arr[i];
           if(sum==k){
               maxlen=i+1;
           }
           if(map.containsKey(sum-k)){
               int length=i-map.get(sum-k);
               maxlen=Math.max(maxlen,length);
           }
           if(!map.containsKey(sum)){
               map.put(sum,i);
           }
       }
       return maxlen;
    }
}
