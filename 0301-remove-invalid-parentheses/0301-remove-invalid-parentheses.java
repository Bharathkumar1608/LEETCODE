class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> list=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        int l=0;
        int r=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                l++;
            }
            else if(s.charAt(i)==')'){
                if(l>0){
                    l--;
                }
                else{
                    r++;
                }
            }
        }
        rec(s,0,l,r,list,set);
        return list;
    }
    static void rec(String s,int i,int l,int r,List<String> list,HashSet<String> set){
        if(l==0 && r==0){
            if(valid(s)){
                if(set.add(s)){
                    list.add(s);
                }
            }
            return;
        }
        for(int j=i;j<s.length();j++){
            if(j>i && s.charAt(j)==s.charAt(j-1)){
                continue;
            }
            if(s.charAt(j)!='(' && s.charAt(j)!=')'){
                continue;
            }
            if(s.charAt(j)=='(' && l>0){
                rec(s.substring(0,j)+s.substring(j+1),j,l-1,r,list,set);
            }
            if(s.charAt(j)==')' && r>0){
                rec(s.substring(0,j)+s.substring(j+1),j,l,r-1,list,set);
            }
        }
    }
    static boolean valid(String s){
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                cnt++;
            }
            else if(s.charAt(i)==')'){
                cnt--;
                if(cnt<0){
                    return false;
                }
            }
        }
        if(cnt==0){
            return true;
        }
        return false;
    }
}