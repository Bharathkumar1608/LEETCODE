class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        return RLE(countAndSay(n-1));
    }
    static String RLE(String str){
        StringBuilder sb=new StringBuilder();
        char[] arr=str.toCharArray();
        int c=0;
        char cur=str.charAt(0);
        for(char ch:arr){
            if(cur==ch){
                c++;
            }
            else{
                sb.append(c);
                sb.append(cur);
                cur=ch;
                c=1;
            }
        }
        sb.append(c);
        sb.append(cur);
        return sb.toString();

    }
}