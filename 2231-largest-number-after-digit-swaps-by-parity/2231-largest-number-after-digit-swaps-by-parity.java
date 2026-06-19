class Solution {
    public int largestInteger(int num) {
        String str=String.valueOf(num);
        int fc=str.charAt(0)-'0';
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> eve=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            int p=str.charAt(i)-'0';
            if((p&1)==0){
                eve.add(p);
            }
            else{
                odd.add(p);
            }
        }
        Collections.sort(eve);
        Collections.sort(odd);
        
        int e=eve.size()-1;
        int o=odd.size()-1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            int p=str.charAt(i)-'0';
            if((p&1)==0){
                sb.append(eve.get(e));
                e--;
            }
            else{
                sb.append(odd.get(o));
                o--;
            }
        }
        return Integer.valueOf(sb.toString());
    }
}