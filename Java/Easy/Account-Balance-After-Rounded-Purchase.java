class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int lower = (int)(Math.round(purchaseAmount/10.0) * 10);
        int upper = lower + 10;
        return 100 - ((purchaseAmount - lower > upper - purchaseAmount) ? upper : lower);
    }
}
