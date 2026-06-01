class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
        String str="";
        for(int i=0;i<words.length;i++){
            str+=words[i];
        }
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        int n=words.length;
        for(int i:map.values()){
            if(i%n!=0){
                return false;
            }
        }
        return true;
    }
}