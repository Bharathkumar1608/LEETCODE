class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)-> a.length()-b.length());
        int n=words.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int max=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(cmp(words[i],words[j]) && dp[i]<dp[j]+1){
                    dp[i]=1+dp[j];
                }
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }
    static boolean cmp(String s,String t){
        if(t.length()+1!=s.length()){
            return false;
        }
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
            i++;
        }
        if(j==t.length()){
            return true;
        }
        return false;
    }
}