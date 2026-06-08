class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> arr=new ArrayList<>();
        int pc=0;
        for(int num:nums){
            if(num==pivot){
                pc++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<pc;i++){
            arr.add(pivot);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr.get(i);
        }
        return nums;
    }
}