class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m=g.length-1;
        int n=s.length-1;
        int cnt=0;
        while(m>=0 && n>=0){
            if(g[m]<=s[n]){
                m--;
                n--;
                cnt++;
            }
            else{
                m--;
            }
        }
        return cnt;
    }
}