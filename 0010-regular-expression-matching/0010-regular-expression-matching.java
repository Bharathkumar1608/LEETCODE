class Solution {
    public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
        return rec(s,p,m-1,n-1);
    }

    static boolean rec(String s,String p,int i,int j){

        if(i<0 && j<0){
            return true;
        }

        if(j<0){
            return false;
        }

        if(i<0){
            for(int x=0;x<=j;x++){
                if(p.charAt(x)!='*'){
                    if(x+1<=j && p.charAt(x+1)=='*'){
                        x++;
                    }else{
                        return false;
                    }
                }
            }
            return true;
        }

        if(p.charAt(j)=='*'){

            if(j==0){
                return false;
            }

            if(p.charAt(j-1)==s.charAt(i) || p.charAt(j-1)=='.'){
                return rec(s,p,i-1,j) || rec(s,p,i,j-2);
            }

            return rec(s,p,i,j-2);
        }

        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'){
            return rec(s,p,i-1,j-1);
        }

        return false;
    }
}