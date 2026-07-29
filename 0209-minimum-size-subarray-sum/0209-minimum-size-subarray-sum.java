class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int minlen=Integer.MAX_VALUE;
        int cs=0;
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            while(cs>=target){
                minlen=Math.min(i-l+1,minlen);
                cs-=nums[l];
                l++;
            }
        }
        if(minlen==Integer.MAX_VALUE){
            return 0;
        }
        return minlen;
    }
}