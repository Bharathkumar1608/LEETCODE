class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        if(n==0){
            return 0;
        }
        String s=String.valueOf(n);
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch-'0')!=0){
                ans+=ch;
                sum+=(ch-'0');
            }
        }
        return Long.valueOf(ans)*sum;
    }
}