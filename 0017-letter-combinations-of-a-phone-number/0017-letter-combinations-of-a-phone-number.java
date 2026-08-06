class Solution {
    public List<String> letterCombinations(String digits) {
       List<String> list=new ArrayList<>();
       String[] d={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       rec(0,list,d,digits,new StringBuilder());
       return list;
    }
    static void rec(int ind,List<String> list,String[] d,String digits,StringBuilder sb){
        if(ind==digits.length()){
            list.add(sb.toString());
            return;
        }
        String dum=d[digits.charAt(ind)-'0'];
        for(int i=0;i<dum.length();i++){
            sb.append(dum.charAt(i));
            rec(ind+1,list,d,digits,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}