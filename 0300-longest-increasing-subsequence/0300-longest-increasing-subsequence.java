class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>list.get(list.size()-1)){
                list.add(nums[i]);
            }
            else{
                int ind=bs(list,nums[i]);
                list.set(ind,nums[i]);
            }
        }
        return list.size();
    }
    static int bs(ArrayList<Integer> list,int k){
        int s=0;
        int e=list.size()-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(list.get(mid)==k){
                return mid;
            }
            else if(list.get(mid)>k){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }
}