class Solution {
    public boolean isFascinating(int n) {
        int n2=n*2;
        int n3=n*3;
        boolean[] arr=new boolean[10];
        arr[0]=true;
        while(n>0){
            if(arr[n%10]){
                return false;
            }
            arr[n%10]=true;
            n=n/10;
        }
        n=n2;
        while(n>0){
            if(arr[n%10]){
                return false;
            }
            arr[n%10]=true;
            n=n/10;
        }
        n=n3;
        while(n>0){
            if(arr[n%10]){
                return false;
            }
            arr[n%10]=true;
            n=n/10;
        }
        for(int i=1;i<=9;i++){
            if(!arr[i]){
                return false;
            }
        }
        return true;
    }
}