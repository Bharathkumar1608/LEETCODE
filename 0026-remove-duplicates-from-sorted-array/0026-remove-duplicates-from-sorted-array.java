class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0; // Slow pointer
        for(int j=1;j<nums.length;j++){
            //j is fast pointer
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}