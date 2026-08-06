class Solution {
    public String minWindow(String s1, String s2) {
        // code here
        int l=0;
       
        int minlen=Integer.MAX_VALUE;
        int sIndex=-1;
        while (l<s1.length()){
            int r=0;
            while(l<s1.length()){
                if(s1.charAt(l)==s2.charAt(r)){
                    r++;
                }
                if(r==s2.length()){
                    break;
                }
                l++;
            }
            if(r<s2.length()){
                break;
            }
            int end=l;
            r=s2.length()-1;
            while(r>=0){
                if(s1.charAt(l)==s2.charAt(r)){
                    r--;    
                }
                l--;
            }
            l++;
            if(end-l+1<minlen){
                minlen=end-l+1;
                sIndex=l;
            }
            l++;
        }
        return sIndex==-1?"":s1.substring(sIndex,sIndex+minlen);
    }
}
