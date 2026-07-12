class Solution {
    public int totalNQueens(int n) {
        int[][] board=new int[n][n];
        return path(board,0);
    }
    static int path(int[][] board,int row){
        if(row==board.length){
            return 1;
        }
        int count=0;
        for(int i=0;i<board.length;i++){
            if(issafe(board,row,i)){
                board[row][i]=1;
                count+=path(board,row+1);
                board[row][i]=0;
            }
        }
        return count;
    }
    static boolean issafe(int[][] board,int row,int col){
        int r=row;
        int c=col;
        while(r>=0){
            if(board[r][c]==1){
                return false;
            }
            r--;
        }
        r=row;
        c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==1){
                return false;
            }
            r--;
            c--;
        }
        r=row;
        c=col;
        while(r>=0 && c<board.length){
            if(board[r][c]==1){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}