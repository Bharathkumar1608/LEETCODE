class Solution {
    public int reverse(int x) {
        String str=String.valueOf(x);
        boolean n=false;
        if(str.charAt(0)=='-'){
            str=str.substring(1);
            n=true;
        }
        str=new StringBuilder(str).reverse().toString();
        int cmp=Integer.MAX_VALUE;
        long p=Long.valueOf(str);
        if(p>cmp){
            p=0;
        }
        if(n){
            return -(int)p;
        }
        return (int)p;
    }
}