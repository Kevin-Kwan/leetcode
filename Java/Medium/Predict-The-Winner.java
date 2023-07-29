class Solution {
    int[][] dp;
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new int[n][n];
        for (int i = 0; i<n;i++) {
            Arrays.fill(dp[i],-1);
        }
        return chooseHelper(nums,0,n-1)>=0;
        
    }
    private int chooseHelper(int[] nums, int left, int right) {
        if (dp[left][right] != -1) {
            return dp[left][right];
        }
        if (left == right) {
            return nums[left];
        }
        int l = nums[left] - chooseHelper(nums,left + 1, right);
        int r = nums[right] - chooseHelper(nums,left, right - 1);
        dp[left][right] = Math.max(l,r);
        return dp[left][right];
    }
}
