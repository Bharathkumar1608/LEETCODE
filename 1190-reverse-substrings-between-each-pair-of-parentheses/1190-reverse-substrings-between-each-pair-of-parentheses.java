class Solution {
    public String reverseParentheses(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch==')'){
                String str="";
                while(!st.isEmpty() && st.peek()!='('){
                    char rc=st.pop();
                    str+=rc;
                }
                st.pop();
                for(int j=0;j<str.length();j++){
                    st.push(str.charAt(j));
                }
            }
            else{
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}