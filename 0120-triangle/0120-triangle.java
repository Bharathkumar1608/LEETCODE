class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int n=triangle.get(m-1).size();
        Integer[][] dp=new Integer[m][n];
        return rec(0,0,triangle,dp);
    }
    static int rec(int i,int j,List<List<Integer>> t,Integer[][] dp){
        if(j<0 || j>=t.get(i).size()){
            return Integer.MAX_VALUE;
        }
        if(i==t.size()-1){
            return t.get(i).get(j);
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        return dp[i][j]=t.get(i).get(j)+Math.min(rec(i+1,j,t,dp),rec(i+1,j+1,t,dp));
    }
}