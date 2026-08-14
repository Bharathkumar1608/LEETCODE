class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        rec(0,nums,list);
        HashSet<List<Integer>> set=new HashSet<>();
        for(List<Integer> li:list){
            set.add(li);
        }
        return new ArrayList<>(set);
    }
    static void rec(int ind,int[] arr,List<List<Integer>> list){
        if(ind==arr.length){
            List<Integer> li=new ArrayList<>();
            for(int num:arr){
                li.add(num);
            }
            list.add(li);
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