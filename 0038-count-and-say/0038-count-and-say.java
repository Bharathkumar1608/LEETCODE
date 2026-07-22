class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        return RLE(countAndSay(n-1));
    }
    static String RLE(String str){
        char[] arr=str.toCharArray();
        char cur=arr[0];
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:arr){
            if(ch==cur){
                count++;
            }
            else{
                sb.append(count);
                sb.append(cur);
                count=1;
                cur=ch;
            }
        }
        sb.append(count);
        sb.append(cur);

        return sb.toString();
    }
}