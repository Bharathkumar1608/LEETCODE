class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(0,coins,amount,dp);
    }
    static int rec(int ind,int[] arr,int tar,int[][] dp){
        if(tar==0){
            return 1;
        }
        if(ind==arr.length){
            return 0;
        }
        if(tar<0){
            return 0;
        }
        if(dp[ind][tar]!=-1){
            return dp[ind][tar];
        }
        return dp[ind][tar]=(rec(ind,arr,tar-arr[ind],dp)+rec(ind+1,arr,tar,dp));
    }
}