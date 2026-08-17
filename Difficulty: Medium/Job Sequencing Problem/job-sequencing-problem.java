class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n=profit.length;
        int maxdeadline=0;
        int[][] jobs=new int[n][2];
        for(int i=0;i<n;i++){
            jobs[i][0]=profit[i];
            jobs[i][1]=deadline[i];
            maxdeadline=Math.max(maxdeadline,deadline[i]);
        }
        
        
        Arrays.sort(jobs,(a,b)->b[0]-a[0]);
        
        int cnt=0;
        int maxProfit=0;
        int[] slots=new int[maxdeadline+1];
        for(int i=0;i<=maxdeadline;i++){
            slots[i]=i;
        }
        
        for(int[] job:jobs){
            int p=job[0];
            int d=job[1];
            int available=find(slots,Math.min(maxdeadline,d));
            
                if(available>0){
                    
                
                    cnt++;
                    maxProfit+=p;
                    slots[available]=find(slots,available-1);
                    
                }
            
        }
        ArrayList<Integer> result=new ArrayList<>();
        result.add(cnt);
        result.add(maxProfit);
        return result;
    }
        private int find(int[] slots,int x){
            if(slots[x]!=x){
                slots[x]=find(slots,slots[x]);
        }
        return slots[x];
        
    }
}