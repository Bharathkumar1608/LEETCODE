class Solution {
    public int maxSubArray(int[] nums) {
        int l=0;
        int r=nums.length;
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<r;i++){
            sum+=nums[i];
            maxsum=Math.max(maxsum,sum);
            while(sum<0){
                sum-=nums[l];
                l++;
            }

        }
        return maxsum;
    }
}