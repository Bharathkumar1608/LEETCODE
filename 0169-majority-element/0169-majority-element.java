class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int cur=0;
        for(int n:nums){
            if(count==0){
                cur=n;
            }
            if(n==cur){
                count++;
            }
            else{
                count--;
            }
        }
        return cur;
    }
}