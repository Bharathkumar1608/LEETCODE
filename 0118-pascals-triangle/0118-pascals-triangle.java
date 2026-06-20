class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> t=new ArrayList<>();
        List<Integer> fr=new ArrayList<>();
        fr.add(1);
        t.add(fr);
        for(int i=1;i<numRows;i++){
            List<Integer> cur=new ArrayList<>();
            List<Integer> prev=t.get(i-1);
            cur.add(1);
            for(int j=1;j<i;j++){
                cur.add(prev.get(j)+prev.get(j-1));
            }
            cur.add(1);
            t.add(cur);

        }
        return t;
    }
}