class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> list=new ArrayList<>();
       rec(0,candidates,target,list,new ArrayList<>());
       return list; 
    }
    static void rec(int ind,int[] arr,int tar,List<List<Integer>> list,ArrayList<Integer> al){
        if(tar==0){
            list.add(new ArrayList<>(al));
            return;
        }
        if(ind==arr.length){
            return;
        }
        if(tar<0){
            return;
        }
        al.add(arr[ind]);
        rec(ind,arr,tar-arr[ind],list,al);
        al.remove(al.size()-1);
        rec(ind+1,arr,tar,list,al);
    }
}