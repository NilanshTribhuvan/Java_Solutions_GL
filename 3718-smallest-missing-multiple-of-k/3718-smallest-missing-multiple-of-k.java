class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> in= new HashSet<>();
        for(int num:nums){
            in.add(num);
        }
        int multiple=k;
        while(in.contains(multiple)){
            multiple+=k;
        }
        return multiple;
    }
}