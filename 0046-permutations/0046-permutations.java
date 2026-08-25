class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        rec(0,nums,list);
        return list;
    }
    static void rec(int ind,int[] arr,List<List<Integer>> list){
        if(ind==arr.length){
            List<Integer> al=new ArrayList<>();
            for(int num:arr){
                al.add(num);
            }
            list.add(al);
            return;
        }
        for(int i=ind;i<arr.length;i++){
            swap(arr,i,ind);
            rec(ind+1,arr,list);
            swap(arr,i,ind);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}