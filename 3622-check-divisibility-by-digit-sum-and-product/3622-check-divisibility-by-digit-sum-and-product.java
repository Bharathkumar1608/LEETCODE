class Solution {
    public boolean checkDivisibility(int n) {
        int[] arr=cal(n);
        int sum=arr[0]+arr[1];
        if(n%sum==0){
            return true;
        }
        return false;
    }
    static int[] cal(int n){
        if(n==0){
            return new int[]{0,0};
        }
        int sum=0;
        int pro=1;
        while(n>0){
            int r=n%10;
            sum+=r;
            pro*=r;
            n/=10;
        }
        return new int[]{sum,pro};
    }
}