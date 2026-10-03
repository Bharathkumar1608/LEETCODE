class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int max=0;
        st.push(-1);
        int n=s.length();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                max=Math.max(max,(i-st.peek()));
            }
        }
        return max;
    }
}