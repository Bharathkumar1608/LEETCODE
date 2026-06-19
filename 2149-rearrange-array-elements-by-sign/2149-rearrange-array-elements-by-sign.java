class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] a1=new int[n/2];
        int[] a2=new int[n/2];
        int i=0;
        int j=0;
        for(int num:nums){
            if(num<0){
                a2[j]=num;
                j++; 
            }
            else{
                a1[i]=num;
                i++;
            }
        }
        i=0;
        j=0;
        for(int p=0;p<n;p++){
            if(p%2==0){
                nums[p]=a1[i];
                i++;
            }
            else{
                nums[p]=a2[j];
                j++;
            }
        }
        return nums;
    }
}