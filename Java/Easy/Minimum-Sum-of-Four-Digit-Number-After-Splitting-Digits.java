class Solution {
  public int minimumSum(int num) {
    int[] nums = new int[String.valueOf(num).length()];
    for (int i = nums.length - 1; i >= 0; i--) {
      nums[i] = num % 10;
      num /= 10;
    }
    Arrays.sort(nums);
    return (nums[0] * 10 + nums[1] * 10 + nums[2] + nums[3]);
  }
}
