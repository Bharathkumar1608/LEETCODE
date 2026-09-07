class Solution {
    public int numDistinct(String s, String t) {
        int m=s.length();
        int n=t.length();
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(s,t,m-1,n-1,dp);
    }
    static int rec(String s,String t,int i,int j,int[][] dp){
        if(j<0){
            return 1;
        }
        if(i<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=rec(s,t,i-1,j-1,dp)+rec(s,t,i-1,j,dp);
        }
        return dp[i][j]=rec(s,t,i-1,j,dp);
    }
}