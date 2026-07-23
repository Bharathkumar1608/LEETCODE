class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return ac(text1,text2,n-1,m-1,dp);
    }
    static int ac(String str1,String str2,int n,int m,int[][] dp){
        if(n<0 || m<0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(str1.charAt(n)==str2.charAt(m)){
            return dp[n][m]=1+ac(str1,str2,n-1,m-1,dp); 
        }
        return dp[n][m]=Math.max(ac(str1,str2,n-1,m,dp),ac(str1,str2,n,m-1,dp));
    }
}