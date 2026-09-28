class Solution {
    public int maxDepth(String s) {
       int cnt=0;
       int n=s.length();
       int max=0;
       for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                cnt++;
                max=Math.max(cnt,max);
            }
            else if(ch==')'){
                cnt--;
            }
       }
       return max; 
    }
}