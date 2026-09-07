class Solution {
    public String countAndSay(int n) {
       if(n==1){
        return "1";
       }
       return RLE(countAndSay(n-1));
    }
    static String RLE(String str){
        StringBuilder sb=new StringBuilder();
        char[] carr=str.toCharArray();
        int c=0;
        char cur=carr[0];
        for(char ch:carr){
            if(ch==cur){
                c++;
            }
            else{
                sb.append(c);
                sb.append(cur);
                c=1;
                cur=ch;
            }
        }
        sb.append(c);
        sb.append(cur);
        return sb.toString();
    }
}