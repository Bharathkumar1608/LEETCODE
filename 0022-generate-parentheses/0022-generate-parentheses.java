class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        rec(n,new StringBuilder(),0,0,list);
        return list;
    }
    static void rec(int n,StringBuilder s,int in,int out,List<String> list){
        if(in+out==(2*n)){
            list.add(s.toString());
            return;
        }
        if(in<n){
            s.append("(");
            rec(n,s,in+1,out,list);
            s.deleteCharAt(s.length()-1);
        }
        if(out<n && in>out){
            s.append(")");
            rec(n,s,in,out+1,list);
            s.deleteCharAt(s.length()-1);
        }
    }
}