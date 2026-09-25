class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        // if(obstacleGrid[m-1][n-1]==1){
        //     return 0;
        // }
        return rec(obstacleGrid,0,0,m,n,dp);
    }
    static int rec(int[][] arr,int i,int j,int m,int n,int[][] dp){
        if(i==m-1 && j==n-1 && arr[i][j]!=1){
            return 1;
        }
        if(i>=m || j>=n || arr[i][j]==1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=rec(arr,i+1,j,m,n,dp)+rec(arr,i,j+1,m,n,dp);
    }
}