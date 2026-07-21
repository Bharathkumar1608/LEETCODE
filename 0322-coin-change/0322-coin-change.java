class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=amount;j++){
                dp[i][j]=-1;
            }
        }
        int ans=ac(coins,n-1,amount,dp);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
    static int ac(int[] arr,int ind,int tar,int[][] dp){

        if(ind==0){
            if(tar%arr[ind]==0){
                return tar/arr[ind];
            }
            else{
                return Integer.MAX_VALUE;
            }
        }
        if(dp[ind][tar]!=-1){
            return dp[ind][tar];
        }

        int nottake=0+ac(arr,ind-1,tar,dp);
        int take=Integer.MAX_VALUE;
        if(arr[ind]<=tar){
            int ans=ac(arr,ind,tar-arr[ind],dp);
            if(ans!=Integer.MAX_VALUE){
                take=1+ans;
            }
        }

        return dp[ind][tar]=Math.min(take,nottake);
    }
}