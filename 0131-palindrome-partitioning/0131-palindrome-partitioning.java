class Solution {
    public List<List<String>> partition(String s) {
    List<List<String>> ans=new ArrayList<>();
    List<String> curr=new ArrayList<>();
    helper(s,ans,curr,0);
    return ans;
    }
    boolean palindrome(String s,int index, int i){
        int left=index;
        int right=i;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    void helper(String s, List<List<String>> ans,List<String> curr, int index){
        if(index==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
            }
           
            for(int i=index;i<s.length();i++){
                if(palindrome(s,index,i)){
                curr.add(s.substring(index,i+1));  
                helper(s,ans,curr,i+1);
               curr.remove(curr.size()-1);
                }
        }
    }
}