class Solution {
    public String largestNumber(int[] nums) {
        String[] sarr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            sarr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(sarr,(a,b)->(b+a).compareTo(a+b));
        System.out.println(Arrays.toString(sarr));
        String str="";
        if(sarr[0].equals("0")){
            return "0";
        }
        for(String s:sarr){
            str+=s;
        }
        return str;
    }
}