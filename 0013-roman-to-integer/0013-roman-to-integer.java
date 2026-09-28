class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n=s.length();
        int sum=0;
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            int num=map.get(ch);
            if(4*num<sum){
                sum-=num;
            }
            else{
                sum+=num;
            }
        }
        return sum;
    }
}