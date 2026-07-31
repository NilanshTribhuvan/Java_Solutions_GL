class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength=0;
        int l = 0;
        int r = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<s.length()){
            char ch = s.charAt(r);
            if(map.containsKey(ch) && map.get(ch)>= l){
                l=map.get(ch)+1;
            }
            map.put(ch,r);
            maxlength=Math.max(maxlength,r-l+1);
            r++;
        }
        return maxlength;

    }
}