class Solution {
    public int numSubseq(int[] nums, int target) {
       Arrays.sort(nums);
       int n=nums.length;
       int l=0;
       int r=n-1;
       int res=0;
       int[] pow=new int[n];
       pow[0]=1;
       for(int i=1;i<n;i++){
        pow[i]=(pow[i-1]*2)%1000000007;
       }
       while(l<=r){
        if((nums[l]+nums[r])<=target){
            res=(res+pow[r-l])%1000000007;
            l++;
        }
        else{
            r--;
        }
       }
       return res;
    }
}