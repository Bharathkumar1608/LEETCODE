class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        if(sum%2!=0){
            return false;
        }
        Boolean[][] dp=new Boolean[nums.length][(sum/2)+1];
        return ss(nums,nums.length-1,sum/2,dp);
    }
    static boolean ss(int[] arr,int ind,int t,Boolean[][] dp){
        if(t==0){
            return true;
        }
        if(ind<0){
            return false;
        }
        if(dp[ind][t]!=null){
            return dp[ind][t];
        }
        if(arr[ind]>t){
            return dp[ind][t]=ss(arr,ind-1,t,dp);
        }
        return dp[ind][t]=ss(arr,ind-1,t-arr[ind],dp)|| ss(arr,ind-1,t,dp);
    }
}