class Solution {
    public int countMonobit(int n) {
        int count=1;
        for(int i=1;i<=n;i++){
            if(ch(i)){
                count++;
            }
        }
        return count;
    }
    static boolean ch(int n){
        if(n%2==0){
            return false;
        }
        while(n!=0){
            if((n&1)!=1){
                return false;
            }
            n=n>>1;
        }
        return true;
    }
}