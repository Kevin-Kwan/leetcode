class Solution {
    public int maxProfit(int[] prices, int fee) {
        if (prices.length == 1) {
            // you will go into the negatives
            return 0;
        }
        int profit = 0;
        int potentialProfit = profit - prices[0]; //if you buy
        for (int i = 1; i<prices.length; i++) {
            // if we sell at this point, how much profit will we have
            profit = Math.max(profit,(prices[i]+potentialProfit)-fee);
            // can we make more money later down the line by holding onto the stock
            potentialProfit = Math.max(potentialProfit,profit-prices[i]);
        }
        return profit;

    }
}
