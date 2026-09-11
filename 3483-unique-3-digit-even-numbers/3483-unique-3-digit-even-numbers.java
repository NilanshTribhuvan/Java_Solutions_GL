class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        Set<Integer> map=new HashSet<>();
        for(int i=0;i<n;i++){
            if(digits[i]%2==1){
                continue;
            }
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                for(int k=0;k<n;k++){
                    if(digits[k]==0||k==i||k==j){
                       continue;
                    }
                    map.add(digits[k]*100+digits[j]*10+digits[i]);
                }
            }
        }
        return map.size();
    }
}