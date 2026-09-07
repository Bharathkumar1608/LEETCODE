class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(word1,word2,m-1,n-1,dp);
    }
    static int rec(String s1,String s2,int i,int j,int[][] dp){
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=rec(s1,s2,i-1,j-1,dp);
        }
        return dp[i][j]=Math.min(1+rec(s1,s2,i,j-1,dp),Math.min(1+rec(s1,s2,i-1,j,dp),1+rec(s1,s2,i-1,j-1,dp)));
    }
}