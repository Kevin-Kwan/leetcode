class Solution {
  public int firstMissingPositive(int[] nums) {
    HashSet<Integer> setNums = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      setNums.add(nums[i]);
    }
    int i = 1;
    while (i <= nums.length) {
      if (setNums.contains(i)) {
        i++;
      } else {
        return i;
      }
    }
    return nums.length + 1;
  }
}
