class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int j=0;
        int[] freq=new int[26];
        char[] chararr=s.toCharArray();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[(ch&31)-1]++;
        }
        for(int i=0;i<26;i++){
            while(freq[i]>1){
                chararr[j]=(char)(97+i);
                chararr[n-1-j]=(char)(97+i);
                j++;
                freq[i]-=2;
            }
        }
        return new String(chararr);
    }
}