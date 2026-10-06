class Solution {
    public int minAddToMakeValid(String s) {
        int o=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                o++;
            }
            else{
                if(o>0){
                    o--;
                }
                else{
                    ans++;
                }
            }
        }
        return o+ans;
    }
}