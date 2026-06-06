class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] l=new int[n];
        int[] r=new int[n];
        int ps=nums[0];
        int ss=nums[n-1];
        for(int i=1;i<n;i++){
            l[i]=ps;
            ps+=nums[i];
        }
        for(int i=n-2;i>=0;i--){
            r[i]=ss;
            ss+=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(l[i]-r[i]);
        }
        return nums;
    }
}