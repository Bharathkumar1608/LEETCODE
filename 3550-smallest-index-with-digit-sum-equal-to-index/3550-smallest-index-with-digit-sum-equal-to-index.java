class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==sumd(nums[i])){
                return i;
            }
        }
        return -1;
    }
    static int sumd(int n){
        if(n<10){
            return n;
        }
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}