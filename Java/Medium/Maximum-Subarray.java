class Solution {
  public int maxSubArray(int[] nums) {
    boolean allNegative = true;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        allNegative = false;
      }
    }

    if (allNegative) {
      int maxValue = Integer.MIN_VALUE;
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] > maxValue) {
          maxValue = nums[i];
        }
      }
      return maxValue;
    }
    int finalMax = Integer.MIN_VALUE;
    int tempMax = 0;

    for (int i = 0; i < nums.length; i++) {
      tempMax += nums[i];
      if (tempMax > finalMax) {
        finalMax = tempMax;
      }
      if (tempMax < 0) {
        tempMax = 0;
      }
    }
    return finalMax;
  }
}
