class Solution {
    public int characterReplacement(String s, int k) {
        int n= s.length();
        int[] freq=new int[26];
        int maxfreq=0;
        int maxlen=0;
        int l=0;
        for(int r=0;r<n;r++){
            freq[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(r)-'A']);
            int replacement=(r-l+1)-maxfreq;
            if(replacement>k){
                 freq[s.charAt(l)-'A']--;
                 l++;
                 replacement=(r-l+1)-maxfreq;
            }
            maxlen=Math.max(maxlen,r-l+1);
            
        }
        return maxlen;
        
    }
}