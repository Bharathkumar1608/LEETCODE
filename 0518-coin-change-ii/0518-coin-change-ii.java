class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(coins,n-1,amount,dp);
    }
    static int rec(int[] arr,int ind,int tar,int[][] dp){
        if(tar==0){
            return 1;
        }
        if(ind<0){
            return 0;
        }
        if(tar<0){
            return 0;
        }
        if(dp[ind][tar]!=-1){
            return dp[ind][tar];
        }
        return dp[ind][tar]=(rec(arr,ind-1,tar,dp)+rec(arr,ind,tar-arr[ind],dp));
    }
}