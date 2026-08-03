class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int l=0;
        int[] freq=new int[26];
        int maxlen=0;
        int maxfreq=0;
        for(int r=0;r<n;r++){
           
                freq[s.charAt(r)-'A']++;
                maxfreq=Math.max(maxfreq,freq[s.charAt(r)-'A']);
                int replacemnet =(r-l+1)-maxfreq;
                while(replacemnet>k){
                    freq[s.charAt(l)-'A']--;
                    l++;
                    replacemnet = (r-l+1)-maxfreq;
                }
                maxlen= Math.max(r-l+1,maxlen);
            }
        
        return maxlen;
    }
}