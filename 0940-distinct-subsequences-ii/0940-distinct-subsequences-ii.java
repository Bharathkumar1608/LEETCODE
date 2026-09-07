class Solution {
    public int distinctSubseqII(String s) {
        long MOD=1000000007l;
        long dp=1;
        long[] arr=new long[26];
        for(char ch:s.toCharArray()){
            int ind=ch-'a';
            long odp=dp;
            dp=(2*dp-arr[ind]+MOD)%MOD;
            arr[ind]=odp;
        }
        return (int)((dp-1+MOD)%MOD);
    }
}