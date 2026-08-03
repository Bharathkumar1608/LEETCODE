class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> bucket=new ArrayList<>();
        int n=nums.length;
        int comb=1<<n;  // =Math.pow(2,n);

        for(int i=0;i<comb;i++){
            List<Integer> list=new ArrayList<>();

            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    list.add(nums[j]);
                }
            }
            bucket.add(list);
        }
        return bucket;
    }
}