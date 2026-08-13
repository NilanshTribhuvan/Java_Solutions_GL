class Solution {
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        // code here
        int n=a.length;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=n-1;
        int j=n-1;
        PriorityQueue<int[]> p=new PriorityQueue<>((x,y)->y[0]-x[0]);

        Set<String> visited=new HashSet<>();
        p.offer(new int[] {a[i]+b[j],i,j});
        visited.add(i+","+j);
        ArrayList<Integer> res=new ArrayList<>();
        while(k>0 && !p.isEmpty()){
        int[] curr=p.poll();
        int sum=curr[0];
        i=curr[1];
        j=curr[2];
        res.add(sum);
        k--;
        
        if(i-1>=0){
            String key=(i-1)+","+j;
            if(!visited.contains(key)){
                p.offer(new int[] {a[i-1]+b[j],i-1,j});
                visited.add(key);
            }
        }
        if(j-1>=0){
            String key=i+","+(j-1);
            if(!visited.contains(key)){
                p.offer(new int[] {a[i]+b[j-1],i,j-1});
                visited.add(key);
            }
        }
         
        }
        return res;
    }
}