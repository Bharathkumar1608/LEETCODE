class Solution {
    public int maxProduct(int n) {
        int max=0;
        int smax=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n=n/10;
        }
        Collections.sort(list);
        n=list.size();
        return list.get(n-1)*list.get(n-2);
    }
}