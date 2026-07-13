class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        String str="123456789";
        for(int i=2;i<=9;i++){
            for(int j=0;j+i<=9;j++){
                String sub=str.substring(j,j+i);
                int n=Integer.parseInt(sub);
                if(n>=low && n<=high){
                    list.add(n);
                }
            }
        }
        return list;
    }
}