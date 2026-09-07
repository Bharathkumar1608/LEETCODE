class Solution {
    public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
        Boolean[][] dp=new Boolean[m][n];
        return rec(s,p,m-1,n-1,dp);
    }
    static boolean rec(String s1,String s2,int i,int j,Boolean[][] dp){
        if(i<0 && j<0){
            return true;
        }
        if(j<0){
            return false;
        }
        if(i<0){
            for(int p=0;p<=j;p++){
                if(s2.charAt(p)!='*'){
                    return false;
                }
            }
            return true;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j) || s2.charAt(j)=='?'){
            return dp[i][j]=rec(s1,s2,i-1,j-1,dp);
        }
        if(s2.charAt(j)=='*'){
            return dp[i][j]=(rec(s1,s2,i-1,j,dp) || rec(s1,s2,i,j-1,dp));
        }
        return dp[i][j]=false;
    }
}