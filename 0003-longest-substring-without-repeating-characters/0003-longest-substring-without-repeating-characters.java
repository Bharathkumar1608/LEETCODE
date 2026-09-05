class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                char lc=s.charAt(l);
                set.remove(lc);
                l++;
            }
            set.add(ch);
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}