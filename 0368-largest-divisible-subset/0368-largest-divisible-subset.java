class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        if(n==1){
            list.add(nums[0]);
            return list;
        }
        int[] dp=new int[n];
        int[] hash=new int[n];
        int max=0;
        int maxind=0;
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            hash[i]=i;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<1+dp[j]){
                    dp[i]=1+dp[j];
                    hash[i]=j;
                }
            }
            if(dp[i]>max){
                max=Math.max(dp[i],max);
                maxind=i;
            }
            
        }
        int i=0;
        while(i<max){
            list.add(nums[maxind]);
            maxind=hash[maxind];
            i++;
        }
        Collections.reverse(list);
        return list;
    }
}