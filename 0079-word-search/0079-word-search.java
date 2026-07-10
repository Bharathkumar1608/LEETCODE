class Solution {
    public boolean exist(char[][] board, String word) {
        boolean var=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(var){
                    return true;
                }
                else{
                    var=var||path(i,j,word,0,board);
                    if(var){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean path(int i,int j,String str,int ind,char[][] board){
        if(ind==str.length()){
            return true;
        }
        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1 || board[i][j]!=str.charAt(ind)){
            return false;
        }
        char ch=board[i][j];
        board[i][j]='#';
        boolean ans=path(i+1,j,str,ind+1,board) || path(i-1,j,str,ind+1,board) || path(i,j+1,str,ind+1,board) || path(i,j-1,str,ind+1,board);
        board[i][j]=ch;

        return ans;
    }
}