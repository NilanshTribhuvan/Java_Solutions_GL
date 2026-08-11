class Solution {
    int f(int[] arr,int low ,int high,int target,int ans){
        if(low>high){
            return ans;
        }
        int mid=(low+high)/2;
        if(arr[mid]>=target){
            return f(arr,low,mid-1,target,mid);
        }else {
            return f(arr,mid+1,high,target,ans);
        }
    }
    int lowerBound(int[] arr, int target) {
        return f(arr,0,arr.length-1,target,arr.length);
    }
}
