class Solution {
    public int coinChange(int[] coins, int amount) {
        int n =coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=rec(n-1,coins,amount,dp);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
    static int rec(int ind,int[] arr,int tar,int[][] dp){
        if(tar==0){
            return 0;
        }
        if(ind==0){
            if(tar%arr[ind]==0){
                return tar/arr[ind];
            }
            return Integer.MAX_VALUE;
        }
        if(tar<0){
            return Integer.MAX_VALUE;
        }
        if(dp[ind][tar]!=-1){
            return dp[ind][tar];
        }
        int pick=rec(ind,arr,tar-arr[ind],dp);
        if(pick!=Integer.MAX_VALUE){
            pick++;
        }
        int notpick=rec(ind-1,arr,tar,dp);

        return dp[ind][tar]=Math.min(pick,notpick);
    }
}