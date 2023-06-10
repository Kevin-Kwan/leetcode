class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int total = money-(prices[0]+prices[1]);
        if (total<0) {
            return money;
        } else {
            return total;
        }
    }
}
