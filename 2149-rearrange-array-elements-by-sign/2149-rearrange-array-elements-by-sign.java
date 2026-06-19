class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int po=0;
        int ne=1;
        for(int num:nums){
            if(num>=0){
                arr[po]=num;
                po+=2;
            }
            else{
                arr[ne]=num;
                ne+=2;
            }
        }
        return arr;
    }
}