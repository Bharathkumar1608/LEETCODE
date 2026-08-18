class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        return rec(0,list,k);
    }
    static int rec(int ci,ArrayList<Integer> list,int k){
        if(list.size()==1){
            return list.get(0);
        }
        int ri=(ci+k-1)%list.size();
        list.remove(ri);
        return rec(ri,list,k);
    }
}