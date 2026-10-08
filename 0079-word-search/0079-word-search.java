class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean[][] visited=new boolean[m][n];
        int[] dr={1,0,0,-1};
        int[] dc={0,-1,1,0};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(find(board,word,visited,i,j,dr,dc,0,m,n)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean find(char[][] board,String word,boolean[][] visited,int i,int j,int[] dr,int[] dc,int index,int m,int n){
        if(i<0 || i>=m || j<0 || j>=n || visited[i][j] || board[i][j]!=word.charAt(index)){
            return false;
        }
        if(index==word.length()-1){
            return true;
        }
        visited[i][j]=true;
        for(int k=0;k<4;k++){
            int newRow=i+dr[k];
            int newCol=j+dc[k];
            if(find(board,word,visited,newRow,newCol,dr,dc,index+1,m,n)){
                return true;
            } 
        }
        visited[i][j]=false;
        return false;

    }
}