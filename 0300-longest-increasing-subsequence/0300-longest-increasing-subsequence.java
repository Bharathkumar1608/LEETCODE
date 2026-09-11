class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(0,-1,nums,dp);
    }
    static int rec(int ind,int pre,int[] arr,int[][] dp){
        if(ind==arr.length){
            return 0;
        }
        if(dp[ind][pre+1]!=-1){
            return dp[ind][pre+1];
        }
        int len=rec(ind+1,pre,arr,dp);
        if(pre==-1 || arr[ind]>arr[pre]){
            len=Math.max(len,1+rec(ind+1,ind,arr,dp));
        }
        return dp[ind][pre+1]= len;
    }
}