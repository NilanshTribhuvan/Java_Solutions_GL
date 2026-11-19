class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        HashSet<Integer> map=new HashSet<>();

        for(int num:nums){
            if(!map.add(num)){
            res.add(num);
            }
        }
        return res;
    }
}