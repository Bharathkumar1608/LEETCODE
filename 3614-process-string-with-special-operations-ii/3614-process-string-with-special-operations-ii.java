class Solution {
    public char processStr(String s, long k) {
        long len=0;
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch=='#'){
                len*=2;
           }
           else if(ch=='*'){
                if(len>0){
                    len--;
                }
           }
           else if(ch=='%'){
           }
           else{
                len++;
           }
        }
        if(k>=len){
            return '.';
        }
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='#'){
                len=len/2;
                if(k>=len){
                    k=k-len;
                }
            }
            else if(c=='%'){
                k=len-1-k;
            }
            else if(c=='*'){
                len++;
            }
            else{
                len--;
                if(len==k){
                    return c;
                }
            }
        }
        return '.';
    }
}