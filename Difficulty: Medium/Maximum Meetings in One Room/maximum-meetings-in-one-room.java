class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        // code here
        int n=s.length;
        ArrayList<Integer> meetings= new ArrayList<>();
        
        for(int i=0;i<n;i++){
            meetings.add(i+1);
        }
        Collections.sort(meetings,(a,b)->{
           if(f[a-1]!=f[b-1]){
               return f[a-1]-f[b-1];
           } 
           return a-b;
        });
        
        ArrayList<Integer> ans =new ArrayList<>();
        
        int lastEle=-1;
        for(int index:meetings){
            if(s[index-1]>lastEle){
                ans.add(index);
                lastEle=f[index-1];
            }
            
        }
        Collections.sort(ans);
        return ans;
    }
}