class Solution {
    public boolean judgeSquareSum(int c) {
        long r=Math.abs((int)Math.sqrt(c));
        long l=0;
        while(l<=r){
            long sum=l*l+r*r;
            if(sum==c){
                return true;
            }
            else if(sum<c){
                l++;
            }
            else{
                r--;
            }
        }
        return false;
    }
}