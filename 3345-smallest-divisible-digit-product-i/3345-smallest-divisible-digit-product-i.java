class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n*t;i++){
            if(pro(i)%t==0){
                return i;
            }
        }
        return 0;
    }
    static int pro(int n){
        if(n<=9){
            return n;
        }
        int pro=1;
        while(n>0){
            pro*=(n%10);
            n=n/10;
        }
        return pro;
    }
}