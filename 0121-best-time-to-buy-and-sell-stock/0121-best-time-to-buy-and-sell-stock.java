class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int p=0;
        for(int i=0;i<prices.length;i++){
            int cst=prices[i]-min;
            p=Math.max(p,cst);
            min=Math.min(min,prices[i]);
        }
        return p;
    }
}