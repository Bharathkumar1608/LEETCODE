class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    static void dfs(int i,int j,char[][] arr){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]=='0'){
            return;
        }
        arr[i][j]='0';
        dfs(i+1,j,arr);
        dfs(i-1,j,arr);
        dfs(i,j+1,arr);
        dfs(i,j-1,arr);
    }
}