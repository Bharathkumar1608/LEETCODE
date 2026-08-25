class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        int p=k;
        for(int i=1;i<=nums.length+1;i++){
            if(!list.contains(k)){
                return k;
            }
            k+=p;
        }
        return -1;
    }
}