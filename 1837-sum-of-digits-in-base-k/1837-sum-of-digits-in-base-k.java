class Solution {
    public int sumBase(int n, int k) {
        int digit=0;
        int place=1;
        int r=0;
        while(n>0){
            r=n%k;
            digit=digit+(r*place);
            place=place*10;
            n=n/k;
        }
        return countd(digit);
    }
    static int countd(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}