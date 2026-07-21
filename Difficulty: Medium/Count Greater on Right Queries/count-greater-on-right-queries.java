class Solution {
    int[] countGreater(int arr[], int indices[]) {
        // code here
        int n=arr.length;
        int q=indices.length;
        int[] ans=new int[q];
        for(int i=0;i<q;i++){
            int index= indices[i];
            int cnt=0;
            for(int j=index+1;j<n;j++){
                if(arr[j]>arr[index]){
                    cnt++;
                }
            }
            ans[i]=cnt;
        }
        return ans;
    }
}
