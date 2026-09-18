class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> fr=new ArrayList<>();
        fr.add(1);
        list.add(fr);
        for(int i=1;i<numRows;i++){
            ArrayList<Integer> cur=new ArrayList<>();
            List<Integer> pre=list.get(i-1);
            cur.add(1);

            for(int j=1;j<i;j++){
                int dum=pre.get(j)+pre.get(j-1);
                cur.add(dum);
            }
            cur.add(1);
            list.add(cur);
        }
        return list;
    }
}