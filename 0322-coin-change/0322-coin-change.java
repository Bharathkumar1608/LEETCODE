class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=amount;j++){
                dp[i][j]=-1;
            }
        }
        int ans=rec(n-1,coins,amount,dp);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
    static int rec(int ind,int[] arr,int target,int[][] dp){
        if(ind==0){
            if(target%arr[ind]==0){
                return target/arr[ind];
            }
            else{
                return Integer.MAX_VALUE;
            }
        }
        if(target==0){
            return 0;
        }
        if(target<0){
            return Integer.MAX_VALUE;
        }
        if(dp[ind][target]!=-1){
            return dp[ind][target];
        }
        int notpick=rec(ind-1,arr,target,dp);
        //int pick=Integer.MAX_VALUE;
        int ans=rec(ind,arr,target-arr[ind],dp);
        if(ans!=Integer.MAX_VALUE){
            ans=ans+1;
        }
        return dp[ind][target]=Math.min(ans,notpick);
    }
}