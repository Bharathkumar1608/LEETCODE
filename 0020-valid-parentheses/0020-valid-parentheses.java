class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch==')' || ch=='}' || ch==']'){
                
                if(!st.isEmpty() && st.peek()==map.get(ch)){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else{
                st.push(ch);
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}