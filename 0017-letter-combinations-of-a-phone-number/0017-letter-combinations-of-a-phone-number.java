class Solution {
    String[] map={
            "","",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
       }; 
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        generate(digits,map,0,"",ans);
        return ans;
    }
    public void generate(String digits,String[] map,int index,String curr,List<String> ans){
        if(index==digits.length()){
            ans.add(curr);
            return;
        }
        String letter=map[digits.charAt(index)-'0'];
        for(int i=0;i<letter.length();i++){
            generate(digits,map,index+1,curr+letter.charAt(i),ans);
        }
    }
}