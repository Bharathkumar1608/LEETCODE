class Solution {
    public long countCommas(long n) {
        long start=1000;
        long com=0;
        while(n>=start){
            com+=n-start+1;
            start*=1000;
        }
        return com;
    }
}