class Solution {
    public List<String> buildArray(int[] target, int n) {
        int ind=0;
        List<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(ind<target.length && i==target[ind]){
                list.add("Push");
                ind++;
            }
            else if(ind<target.length){
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}