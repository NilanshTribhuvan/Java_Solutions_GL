class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code 
        int n= arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i =0,j=0,cnt=0;
        int max=Integer.MIN_VALUE;
        while(i<n){
            if(arr[i]<=dep[j]){
                i++;
                cnt++;
            }else{
            j++;
            cnt--;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}
