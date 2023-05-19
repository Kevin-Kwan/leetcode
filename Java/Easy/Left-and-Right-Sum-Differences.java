class Solution {
  public int[] leftRigthDifference(int[] nums) {
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];
    if (nums.length == 1) {
      return new int[1];
    }
    for (int i = 0; i < nums.length - 1; i++) {
      right[right.length - 2 - i] += nums[nums.length - 1 - i] + right[right.length - 1 - i];
      left[i + 1] = nums[i] + left[i];
    }
    for (int j = 0; j < nums.length; j++) {
      nums[j] = Math.abs(left[j] - right[j]);
    }
    return nums;
  }
}
