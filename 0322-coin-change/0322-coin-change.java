class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int n=coins.length;
        int[][] dp=new int[n][amount+1];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        } 
        int ans=rec(coins,n-1,amount,dp);
        if(ans!=Integer.MAX_VALUE){
            return ans;
        }
        return -1;
    }
    static int rec(int[] arr,int ind,int tar,int[][] dp){
        if(tar==0){
            return 0;
        }
        if(ind<=0){
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
        int np=rec(arr,ind-1,tar,dp);
        int pk=rec(arr,ind,tar-arr[ind],dp);
        if(pk!=Integer.MAX_VALUE){
            pk+=1;
        }
        return dp[ind][tar]=Math.min(np,pk);
    }
}