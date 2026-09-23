class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int n=nums.length;
        int ind=0;
        int cnt=0;
        while(ind<n){
            if(nums[ind]==0){
                cnt=0;
            }
            else{
                cnt++;
            }
            max=Math.max(max,cnt);
            ind++;
        }
        return max;
    }
}