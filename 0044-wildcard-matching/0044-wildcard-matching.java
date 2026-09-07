class Solution {
    public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
        Boolean[][] dp=new Boolean[m][n];
        return rec(s,p,m-1,n-1,dp);
    }
    static boolean rec(String s,String p,int i,int j,Boolean[][] dp){
        if(i<0 && j<0){
            return true;
        }
        if(j<0){
            return false;
        }
        if(i<0){
            for(int x=0;x<=j;x++){
                if(p.charAt(x)!='*'){
                    return false;
                }
            }
            return true;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            return dp[i][j]=rec(s,p,i-1,j-1,dp);
        }
        if(p.charAt(j)=='*'){
            return dp[i][j]=(rec(s,p,i-1,j,dp)|| rec(s,p,i,j-1,dp));
        }
        return false;
    }
}