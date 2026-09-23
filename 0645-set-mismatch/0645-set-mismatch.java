class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        int[] res=new int[2];
        for(int x:nums){
            list.add(x);
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                res[0]=nums[i];
                break;
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!list.contains(i)){
                res[1]=i;
                break;
            }
        }
        return res;
    }
}