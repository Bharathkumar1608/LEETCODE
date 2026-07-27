class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int n:nums){
            if(n>max1){
                max2=max1;
                max1=n;
            }
            else if(n>max2){
                max2=n;
            }
            if(n<min1){
                min2=min1;
                min1=n;
            }
            else{
                min2=n;
            }
        }
        return Math.max(((max1-1)*(max2-1)),((min1-1)*(min2-1)));
    }
}