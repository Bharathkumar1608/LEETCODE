class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        char[] chars="0123456789abcdef".toCharArray();
        StringBuilder sb=new StringBuilder();
        while(num!=0){
            int r=num&15;
            sb.append(chars[r]);
            num=num>>>4;
        }
        return sb.reverse().toString();
    }
}