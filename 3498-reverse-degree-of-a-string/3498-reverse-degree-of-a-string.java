class Solution {
    public int reverseDegree(String s) {
        int  sum=0;
        for(int i=0;i<s.length();i++){
            int p=s.charAt(i)-'a';
            p=26-p;
            sum+=p*(i+1);
        }
        return sum;
    }
}