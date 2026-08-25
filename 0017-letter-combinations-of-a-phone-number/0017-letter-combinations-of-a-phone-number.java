class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        String[] l={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(0,digits,l,list,new StringBuilder());
        return list;
    }
    static void backtrack(int ind,String word,String[] arr,List<String> list,StringBuilder sb){
        if(ind==word.length()){
            list.add(sb.toString());
            return;
        }
        String w=arr[Integer.parseInt(String.valueOf(word.charAt(ind)))];
        for(int i=0;i<w.length();i++){
            sb.append(w.charAt(i));
            backtrack(ind+1,word,arr,list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}