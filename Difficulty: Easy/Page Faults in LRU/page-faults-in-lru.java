class Solution {
    public int pageFaults(int[] pages, int c) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        LinkedList<Integer> lru = new LinkedList<>();
        int fault=0;
        
        for(int page:pages){
            if(set.contains(page)){
                lru.remove((Integer)page);
                lru.addLast(page);
            }
        else{
            fault++;
            if(set.size()==c){
                int remove=lru.removeFirst();
                set.remove(remove);
            }
            set.add(page);
            lru.addLast(page);
        }
        }
        
        return fault;
    }
}