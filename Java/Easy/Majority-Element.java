class Solution {
  public int majorityElement(int[] nums) {
    int threshold = nums.length / 2;
    Map<Integer, Integer> storage = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int temp = storage.getOrDefault(nums[i], 0) + 1;
      if (temp > threshold) {
        return nums[i];
      }
      storage.put(nums[i], temp);
    }
    return 0;
  }
}
