class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[2*n];
        int f=0;
        int s=n;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=nums[f];
                f++;
            }
            else{
                arr[i]=nums[s];
                s++;
            }
        }
        return arr;
    }
}