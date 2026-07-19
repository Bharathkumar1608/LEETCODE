class Solution {
    public String smallestSubsequence(String s) {
        int[] freq=new int[27];
        boolean[] visited=new boolean[27];
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) & 31]++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int x=ch & 31;
            freq[x]--;
            if(visited[x]){
                continue;
            }
            while(!st.isEmpty()){
                if(st.peek()<=ch){
                    break;
                }
                if(freq[st.peek() & 31]==0){
                    break;
                }
                visited[st.peek() & 31]=false;
                st.pop();
            }
            st.push(ch);
            visited[x]=true;
        }
        String str="";
        for(char c:st){
            str+=c;
        }
        return str;
    }
}