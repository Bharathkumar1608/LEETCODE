class Solution {
    public int largestInteger(int n, int s) {
        int num=0;
        if(n*9<s){
            return -1;
        }
        for(int i=0;i<n;i++){
            if(s>=9){
                num=num*10+9;
                s-=9;
            }
            else{
                num=num*10+s;
                s=0;
            }

        }
        return num;
    }
}