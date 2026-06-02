class Solution {
    public boolean rotateString(String s, String goal) {
        String str="";
        if(s.length()!=goal.length()){
            return false;
        }
        str=s+s;
        System.out.println(str);
        if(str.contains(goal)){
            return true;
        }
        return false;
    }
}