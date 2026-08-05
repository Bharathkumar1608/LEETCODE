class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        rec(0,list,candidates,target,new ArrayList<>());
        return list;
    }
    static void rec(int ind,List<List<Integer>> list,int[] arr,int target,ArrayList<Integer> al){
        if(ind==arr.length){
            return;
        }
        if(target==0){
            list.add(new ArrayList<>(al));
            return;
        }
        if(target<0){
            return;
        }
        al.add(arr[ind]);
        rec(ind,list,arr,target-arr[ind],al);
        al.remove(al.size()-1);
        rec(ind+1,list,arr,target,al);
    }
}