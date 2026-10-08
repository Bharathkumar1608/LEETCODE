class Solution {
    public String removeOuterParentheses(String s) {
        int cnt=0;
        int si=0;
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt==0){
                res+=s.substring(si+1,i);
                si=i+1;
            }
        }
        return res;

    }
}