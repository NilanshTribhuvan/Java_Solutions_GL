class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            p.add(arr[i]);
            if(p.size()>k){
                arr[i-k]=p.poll();
            }
        }
        while(!p.isEmpty()){
            arr[arr.length-p.size()]=p.poll();
        }
    }
}
