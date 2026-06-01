class Solution {
    public int minimumFlips(int n) {
        String str=Integer.toBinaryString(n);
        String rev=new StringBuilder(str).reverse().toString();
        int mis=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=rev.charAt(i)){
                mis++;
            }
        }

        return mis;
    }
}