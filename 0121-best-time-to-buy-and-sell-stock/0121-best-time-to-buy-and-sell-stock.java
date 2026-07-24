class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int n=prices.length;
        int minp=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<minp){
                minp=prices[i];
            }
            else if((prices[i]-minp)>max){
                max=prices[i]-minp;
            }
        }
        return max;
    }
}