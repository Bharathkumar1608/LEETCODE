class Solution {
    public int gcdOfOddEvenSums(int n) {
        int es=0;
        int os=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0){
                es+=i;
            }
            else{
                os+=i;
            }
        }
        return gcd(os,es);
    }
    static int gcd(int a,int b){
        if(b>a){
            return gcd(b,a);
        }
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}