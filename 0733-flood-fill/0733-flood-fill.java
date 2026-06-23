class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old=image[sr][sc];
        if(old==color){
            return image;
        }
        dfs(image,sr,sc,old,color);
        return image;
    }
    static void dfs(int[][] image,int i,int j,int old,int col){
        if(i<0 || j<0 || i>image.length-1 || j>image[0].length-1 || image[i][j]!=old){
            return;
        }
        image[i][j]=col;
        dfs(image,i+1,j,old,col);
        dfs(image,i-1,j,old,col);
        dfs(image,i,j+1,old,col);
        dfs(image,i,j-1,old,col);
    }
}