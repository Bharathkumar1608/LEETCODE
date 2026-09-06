class Solution {
    public int minInsertions(String s) {
        int l=0;
        int r=s.length()-1;
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return fun(s,l,r,dp);
    }
    static int fun(String s,int l,int r,int[][] dp){
        if(l>=r){
            return 0;
        }
        if(dp[l][r]!=-1){
            return dp[l][r];
        }
        if(s.charAt(l)==s.charAt(r)){
           return dp[l][r]=fun(s,l+1,r-1,dp);
        }
        return dp[l][r]= Math.min(2+fun(s,l+1,r-1,dp),Math.min(1+fun(s,l+1,r,dp),1+fun(s,l,r-1,dp)));
    }
}