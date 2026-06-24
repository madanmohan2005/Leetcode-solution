class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int maxprofit=0;
        int n=prices.length;
        for(int i=0; i<n; i++)
        {
            int cost=prices[i]-mini;
            maxprofit=Math.max(maxprofit,cost);
            mini=Math.min(prices[i],mini);
        }
        return maxprofit;
    }
}