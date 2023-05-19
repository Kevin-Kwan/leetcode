class Solution {
  public int missingNumber(int[] nums) {
    int n = nums.length;
    int desiredSum = (n * (n + 1)) / 2;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += nums[i];
    }
    return desiredSum - sum;
  }
}
