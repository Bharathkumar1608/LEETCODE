class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(0,n-1,s,dp);
    }
    static int rec(int l,int r,String s,int[][] dp){
        if(l>=r){
            return 0;
        }
        if(dp[l][r]!=-1){
            return dp[l][r];
        }
        if(s.charAt(l)==s.charAt(r)){
            return dp[l][r]=rec(l+1,r-1,s,dp);
        }
        return dp[l][r]=Math.min(1+rec(l,r-1,s,dp),1+rec(l+1,r,s,dp));
    }
}