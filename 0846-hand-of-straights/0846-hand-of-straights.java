class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> p = new PriorityQueue<>();
        if(hand.length%groupSize!=0){
            return false;
        }
         for (int card : hand) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }
        
        for(int v:map.keySet()){
            p.add(v);
        }
        while(!p.isEmpty()){
            int first=p.poll();
            int freq=map.get(first);
            for(int i=0;i<groupSize;i++){
                int card= first+i;
                if(!map.containsKey(card)  || map.get(card)<freq){
                    return false;
                }
                map.put(card,map.get(card)-freq);

                if(map.get(card)==0){
                    p.remove(card);
                }
            }
        }
        return true;
    }
}