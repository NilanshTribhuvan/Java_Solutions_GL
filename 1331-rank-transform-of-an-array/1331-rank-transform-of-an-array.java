class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedarr=arr.clone();
       Arrays.sort(sortedarr);
       HashMap<Integer,Integer> map=new HashMap<>();
       int rank=1; 
       for(int num:sortedarr){
        if(!map.containsKey(num)){
            map.put(num,rank);
            rank++;
        }
       }
       int[] result = new int[arr.length];
       for(int i=0;i<arr.length;i++){
        result[i] = map.get(arr[i]); 
       }
        return result;
    }
}