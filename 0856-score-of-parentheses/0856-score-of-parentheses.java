class Solution {
    public int scoreOfParentheses(String s) {
        return rec(s,0,s.length()-1);
    }
    static int rec(String s,int l,int r){
        if(l+1==r){
            return 1;
        }
        int cnt=0;
        for(int i=l;i<=r;i++){
            if(s.charAt(i)=='('){
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt==0){
                if(i==r){
                    return 2*rec(s,l+1,r-1);
                }
                return rec(s,l,i)+rec(s,i+1,r);
            }
        }
        return 0;
    }
}