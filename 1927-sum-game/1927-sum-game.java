class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int half=n/2;
        int ls=0;
        int lq=0;
        int rs=0;
        int rq=0;
        int index=0;

        for(char ch:num.toCharArray()){
            if(index<half){
                if(ch=='?'){
                    lq++;
                }else{
                    ls+=ch-'0';
                }
            }else{
                if(ch=='?'){
                    rq++;
                }else{
                    rs+=ch-'0';
                }

            }
            index++;
        }
        if((lq+rq)%2==1){
            return true;
        }
        int diff=ls-rs;
        int qdiff=lq-rq;
        return diff+9*(qdiff/2)!=0;
    }
}