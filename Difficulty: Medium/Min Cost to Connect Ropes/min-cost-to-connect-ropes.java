class Solution {
    public int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int v:arr){
            p.add(v);
        }
        int cost=0;
        while(p.size()>1){
            int first=p.poll();
            int second=p.poll();
            int sum=first+second;
            cost+=sum;
            
            p.add(sum);
        }
        return cost;
    }
}