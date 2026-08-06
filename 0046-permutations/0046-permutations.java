class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        rec(0,nums,list);
        return list;
    }
    static void rec(int ind,int[] arr,List<List<Integer>> list){
        if(ind==arr.length){
            ArrayList<Integer> dummy=new ArrayList<>();
            for(int i:arr){
                dummy.add(i);
            }
            list.add(dummy);
            return;
        }
        for(int i=ind;i<arr.length;i++){
            swap(ind,i,arr);
            rec(ind+1,arr,list);
            swap(ind,i,arr);
        }
    }
    static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}