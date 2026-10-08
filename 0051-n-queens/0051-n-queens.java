class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        find(n,ans,board,0);
        return ans;
    }
    public void find(int n, List<List<String>> ans,char[][] board,int row){
        if(row==n){
            List<String> res=new ArrayList<>();
            for(int i=0;i<n;i++){
                res.add(new String(board[i]));
            }
            ans.add(res);
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(n,board,row,col)){
                board[row][col]='Q';
                find(n,ans,board,row+1);
                board[row][col]='.';
            }
        }
    }
    public boolean isSafe(int n,char[][] board, int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        int r=row-1;
        int c=col-1;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }
        r=row-1;
        c=col+1;
        while(r>=0 && c<n){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}