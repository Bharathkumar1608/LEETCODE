class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int cnt=1;
        if(n<=0){
            return 0;
        }
        int cur=nums[0];
        int max=1;
        for(int i=1;i<n;i++){
            if(nums[i]==cur+1){
                cnt++;
                cur=nums[i];
            }
            else if(nums[i]==cur){
                continue;
            }
            else{
                cnt=1;
                cur=nums[i];
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}