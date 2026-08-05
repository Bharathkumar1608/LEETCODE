class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();

        rec(0,nums,list,new ArrayList<>());

        return list;
    }
    static void rec(int ind,int[] nums,List<List<Integer>> list,ArrayList<Integer> arr){
        if(ind==nums.length){
            list.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[ind]);
        rec(ind+1,nums,list,arr);
        arr.remove(arr.size()-1);
        rec(ind+1,nums,list,arr);
    }
}