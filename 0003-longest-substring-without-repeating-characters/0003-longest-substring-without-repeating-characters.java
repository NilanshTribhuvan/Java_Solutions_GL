class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        int left=0;
        int maxlen=0;
        int[] freq=new int[128];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch]++;

            while(freq[ch]>1){
                char leftmost=s.charAt(left);
                freq[leftmost]--;
                left++;
            }
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;

    }
}