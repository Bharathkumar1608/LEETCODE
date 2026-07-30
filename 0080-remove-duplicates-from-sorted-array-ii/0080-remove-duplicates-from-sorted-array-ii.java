class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int cur=-1;
        int cc=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(cur==num){
                cc++;
                if(cc>=2){
                    continue;
                }
                else{
                    nums[j]=cur;
                    j++;
                }
            }
            else{
                cur=num;
                cc=0;
                nums[j]=cur;
                j++;
            }
        }
        return j;
    }
}