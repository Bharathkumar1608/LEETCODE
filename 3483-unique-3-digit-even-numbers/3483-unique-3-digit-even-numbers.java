class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<String> set=new HashSet<>();
        int n=digits.length;
        boolean[] used=new boolean[n];
        rec(digits,set,new StringBuilder(),used);
        System.out.println(set);
        return set.size();
    }
    static void rec(int[] arr,HashSet<String> set,StringBuilder sb,boolean[] used){
        if(sb.length()==3){
            String str=sb.toString();
            char ch=str.charAt(2);
            if((ch=='0' || ch=='2' || ch=='4' || ch=='6' || ch=='8') && str.charAt(0)!='0'){
                set.add(str);
            }
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            sb.append(arr[i]);
            rec(arr,set,sb,used);
            sb.deleteCharAt(sb.length()-1);
            used[i]=false;
        }
    }
}