class Solution {
    public int minInsertions(String s) {
        int o=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                o++;
            }
            else{
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    i++;
                }
                else{
                    ans++;
                }
                if(o>0){
                    o--;
                }
                else{
                    ans++;
                }
            }
        }
        return ans+o*2;
    }
}