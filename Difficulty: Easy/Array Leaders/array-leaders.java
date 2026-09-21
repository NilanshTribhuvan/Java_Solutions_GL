class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        int max=arr[n-1];
        res.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                res.add(arr[i]);
                max=arr[i];
                
            }
        }
         Collections.reverse(res);
         return res;
    }
}
