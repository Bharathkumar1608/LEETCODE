class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(num%2==0){
                set.add(2);
                while(num%2==0){
                    num/=2;
                }
            }
            for(int i=3;i*i<=num;i+=2){
                if(num%i==0){
                    set.add(i);
                    while(num%i==0){
                        num/=i;
                    }
                }
            }
            if(num>1){
                set.add(num);
            }
        }
        return set.size();
    }
}