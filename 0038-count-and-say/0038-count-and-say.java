class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        return RLE(countAndSay(n-1));
    }
    public String RLE(String str){
        StringBuilder sb=new StringBuilder();
        char[] nums=str.toCharArray();
        int count=0;
        char cur=nums[0];
        for(char c:nums){
            if(c==cur){
                count++;
            }
            else{
                sb.append(count);
                sb.append(cur);
                cur=c;
                count=1;
            }
        }
        sb.append(count);
        sb.append(cur);

        return sb.toString();
    }
}