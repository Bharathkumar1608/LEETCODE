class Solution {
    public int countCommas(int n) {
        int com=0;
        long start=1000;
        while(n>=start){
            com+=(n-start)+1;
            start*=1000;
        }
        return com;
    }
}