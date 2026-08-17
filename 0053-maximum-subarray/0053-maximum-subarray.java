class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int l=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            while(sum<0){
                sum-=nums[l];
                l++;
            }
        }
        return max;
    }
}