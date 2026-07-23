class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return n;
        }
        int x=0;
        for(int num:nums){
            x|=num;
        }
        return x+1;
    }
}