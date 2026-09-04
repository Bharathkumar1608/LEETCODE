class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int res=-1;
        for(int i=0;i<nums.length;i++){
            int temp=lm(nums,i)-rm(nums,i);
            if(temp<=k){
                res=i;
                break;
            }
        }
        return res;
    }
    static int lm(int[] arr,int ind){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=ind;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    static int rm(int[] arr,int ind){
        int min=Integer.MAX_VALUE;
        for(int i=ind;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}