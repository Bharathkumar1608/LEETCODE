class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(0,n-1,s,dp);
    }
    static int rec(int s,int e,String str,int[][] dp){
        if(s>=e){
            return 0;
        }
        if(dp[s][e]!=-1){
            return dp[s][e];
        }
        if(str.charAt(s)==str.charAt(e)){
            return dp[s][e]=rec(s+1,e-1,str,dp);
        }
        return dp[s][e]=Math.min(1+rec(s+1,e,str,dp),1+rec(s,e-1,str,dp));
    }
}
