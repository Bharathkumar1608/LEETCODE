class Solution {
    public boolean checkValidString(String s) {
        int i=0;
        int j=0;
        for(int x=0;x<s.length();x++){
            char ch=s.charAt(x);
            if(ch=='('){
                i++;
                j++;
            }
            else if(ch==')'){
                i--;
                j--;
            }
            else{
                i--;
                j++;
            }
            if(j<0){
                return false;
            }
            i=Math.max(i,0);
        }
        if(i==0){
            return true;
        }
        return false;
    }
}