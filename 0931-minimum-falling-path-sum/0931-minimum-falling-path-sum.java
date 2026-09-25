class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(rec(matrix,0,i,m,n,dp,vis),min);
        }
        return min;
    }
    static int rec(int[][] arr,int i,int j,int m,int n,int[][] dp,boolean[][] vis){
        if(i>=m || j<0 || j>=n){
            return Integer.MAX_VALUE;
        }
        if(i==m-1){
            return arr[i][j];
        }
        if(vis[i][j]){
            return dp[i][j];
        }
        int ld=rec(arr,i+1,j-1,m,n,dp,vis);
        int dd=rec(arr,i+1,j,m,n,dp,vis);
        int rd=rec(arr,i+1,j+1,m,n,dp,vis);
        vis[i][j]=true;
        return dp[i][j]=arr[i][j]+Math.min(dd,Math.min(ld,rd));
    }
}