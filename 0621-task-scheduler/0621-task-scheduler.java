class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        PriorityQueue<Integer> p= new PriorityQueue<>(Collections.reverseOrder());
        for(int v:map.values()){
            p.add(v);
        }
        int time=0;
        while(!p.isEmpty()){
            int cycle=n+1;
            int i=0;
            List<Integer> arr=new ArrayList<>();
            while(i<cycle && !p.isEmpty()){
                int count=p.poll();
                count--;
               
                if(count>0){
                    arr.add(count);
                }
            time++;
            i++;
            }
            for(int v:arr){
                p.add(v);
            }
            if(!p.isEmpty()){
                time+=(cycle-i);
            }
        }
        return time;
    }
}