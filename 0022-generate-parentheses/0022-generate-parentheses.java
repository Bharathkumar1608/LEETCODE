class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        rec(n,0,0,list,new StringBuilder());
        return list;
    }
    static void rec(int n,int i,int o,List<String> list,StringBuilder sb){
        if(i+o==2*n){
            list.add(sb.toString());
        }
        if(i<n){
            sb.append('(');
            rec(n,i+1,o,list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(o<n && o<i){
            sb.append(')');
            rec(n,i,o+1,list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}