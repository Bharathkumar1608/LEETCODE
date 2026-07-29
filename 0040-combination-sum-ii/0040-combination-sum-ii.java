class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        allcomb(0,candidates,target,list,new ArrayList<>());
        return list;
    }
    static void allcomb(int ind,int[] arr,int tar,List<List<Integer>> list,List<Integer> dummy){
        if(tar==0){
            list.add(new ArrayList<>(dummy));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>tar){
                break;
            }
            dummy.add(arr[i]);
            allcomb(i+1,arr,tar-arr[i],list,dummy);
            dummy.remove(dummy.size()-1);
        }
    }
}