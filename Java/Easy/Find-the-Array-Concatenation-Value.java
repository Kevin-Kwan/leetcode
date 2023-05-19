class Solution {
  public long findTheArrayConcVal(int[] nums) {
    long answer = 0;
    for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
      answer += Integer.parseInt(Integer.toString(nums[i]) + Integer.toString(nums[j]));
    }
    if (nums.length % 2 != 0) {
      answer += nums[nums.length / 2];
    }
    return answer;
  }
}
