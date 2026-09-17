class Solution {
    
    public void merge(int[] arr,int l,int mid,int r){
        ArrayList<Integer> res=new ArrayList<>();
        int left=l;
        int right=mid+1;
        
        while(left<=mid && right<=r){
            if(arr[left]<arr[right]){
                res.add(arr[left]);
                left++;
            }else{
                res.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            res.add(arr[left]);
            left++;
        }
        while(right<=r){
            res.add(arr[right]);
            right++;
        }
        
        for(int i=l;i<=r;i++){
            arr[i]=res.get(i-l);
        }
    }
    
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return;
        }
        int mid = l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
        
    }
}