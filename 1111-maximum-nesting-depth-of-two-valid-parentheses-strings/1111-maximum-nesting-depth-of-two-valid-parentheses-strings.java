class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int[] arr=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if (seq.charAt(i) == '(') {
                cnt++;
                arr[i] = cnt % 2;
            } else {
                arr[i] = cnt % 2;
                cnt--;
            }
        }
        return arr;
    }
}