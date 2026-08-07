class Solution {
    public boolean isMaxHeap(int[] arr) {
        // code here
        
        
        int i=0;
        
        while(i<arr.length){
              int largest=i;
              int left= 2*i+1;
        int right =2*i+2;
        
        if(left<arr.length &&arr[largest]<arr[left]){
            return false;
        }
         if(right<arr.length &&arr[largest]<arr[right]){
            return false;
        }
        
        i++;
    }
        return true;
    }
}