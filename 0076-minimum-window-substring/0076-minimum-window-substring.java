class Solution {
    public String minWindow(String s, String t) {
        int l=0;
        int r=0;
        int count=0;
        int minlen=Integer.MAX_VALUE;
        int sIndex=-1;
        int[] freq=new int[256]; 
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        }
        while(r<s.length()){
            if(freq[s.charAt(r)]>0){
                count+=1;
            }
            freq[s.charAt(r)]--;
            while(count == t.length()){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    sIndex=l;
                }
                freq[s.charAt(l)]++;
                if( freq[s.charAt(l)]>0){
                    count--;
                }
                l++;
            }
            r++;
            }

        return sIndex==-1?"":s.substring(sIndex,sIndex+minlen);
    }
}