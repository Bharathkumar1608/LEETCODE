class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int si=0;
        int cnt=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt==0){
                sb.append(s.substring(si+1,i));
                si=i+1;
            }
        }
        return sb.toString();
    }
}