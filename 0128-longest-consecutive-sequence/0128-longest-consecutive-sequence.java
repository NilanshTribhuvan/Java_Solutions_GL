class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int longest=1;
        if(n==0) return 0;
        Set<Integer> l=new HashSet<>();
        for(int i=0;i<n;i++){
            l.add(nums[i]);
        }
        for(int it:l){
            if(!l.contains(it-1)){
                int cnt=1;
                int x=it;
                 while(l.contains(x+1)){
                x=x+1;
                cnt=cnt+1;
            }
            longest=Math.max(longest,cnt);
            }
           
        }
        
        return longest;

    }
}