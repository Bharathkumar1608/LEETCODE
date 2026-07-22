class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        if(sum%2!=0){
            return false;
        }
        int n=nums.length;
        int tar=sum/2;
        Boolean[][] dp=new Boolean[n][tar+1];

        return ac(nums.length-1,nums,tar,dp);
    }
    static boolean ac(int ind,int[] nums,int tar,Boolean[][] dp){
        if(tar==0){
            return true;
        }
        if(ind<0){
            return false;
        }
        if(tar<0){
            return false;
        }
        if(dp[ind][tar]!=null){
            return dp[ind][tar];
        }
        return dp[ind][tar]=(ac(ind-1,nums,tar,dp)||ac(ind-1,nums,tar-nums[ind],dp));
    }
}