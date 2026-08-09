class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arr){
            p.add(num);
        
        if(p.size()>k){
            p.poll();
        }
        }
        return p.peek();
    }
}
