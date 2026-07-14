class Solution {
    public boolean isValidSudoku(char[][] board) {
        return solve(board);
    }
    static boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'){
                    char ch=board[i][j];
                    board[i][j]='.';
                    if(!isvalid(board,i,j,ch)){
                        return false;
                    }
                    board[i][j]=ch;
                }
            }
        }
        return true;
    }
    static boolean isvalid(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[i][col]==c){
                return false;
            }
            if(board[row][i]==c){
                return false;
            }
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c){
                return false;
            }
        }
        return true;
    }
}