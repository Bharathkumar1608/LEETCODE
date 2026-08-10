class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        int comb=1<<n;
        for(int i=0;i<comb;i++){
            ArrayList<Integer> al=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))!=0){
                    al.add(nums[j]);
                }
            }
            set.add(al);
        }
        for(List<Integer> p:set){
            list.add(p);
        }
        return list;
    }
}