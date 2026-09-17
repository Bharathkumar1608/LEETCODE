class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gl=g.length;
        int sl=s.length;
        int[][] dp=new int[gl+1][sl+1];
        for(int i=1;i<=gl;i++){
            for(int j=1;j<=sl;j++){
                if(g[i-1]<=s[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[gl][sl];
    }
}