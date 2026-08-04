class Solution {
    public boolean isFascinating(int n) {
        String str=""+n+n*2+n*3;
        if(str.length()>9){
            return false;
        }
        int[] arr=new int[9];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int p=ch-'0';
            if(p==0){
                return false;
            }
            arr[p-1]++;
            if(arr[p-1]>1){
                return false;
            }
        }
        return true;
    }
}