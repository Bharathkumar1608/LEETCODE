class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> blist=new ArrayList<>();
        int ac=1<<nums.length;  //2^n

        for(int i=0;i<ac;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i & (1 << j))!=0){
                    list.add(nums[j]);
                }
            }

            blist.add(list);
        }
        return blist;
    }
}