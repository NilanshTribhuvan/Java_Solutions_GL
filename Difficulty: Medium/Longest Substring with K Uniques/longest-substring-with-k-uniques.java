class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int l=0;
        int[] freq = new int[26];
        int unique=0;
        int maxlen=-1;
        for(int r=0;r<s.length();r++){
            if(freq[s.charAt(r)-'a']==0){
                unique++;
            }
            freq[s.charAt(r)-'a']++;
            while(unique>k){
                
                freq[s.charAt(l)-'a']--;
                if(freq[s.charAt(l)-'a']==0){
                    unique--;
                }
                
                l++;
            }
            if(unique==k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            
        }
        return maxlen;
    }
}