class Solution {
    public char kthCharacter(int k) {
        String dum=rec("a",k);
        return dum.charAt(k-1);
    }
    static String rec(String s,int k){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char pc=(char)(ch+1);
            sb.append(pc);
        }
        if(sb.length()>=k){
            return sb.toString();
        }
        return rec(sb.toString(),k);
    }
}