class Solution {
  public int mostFrequentEven(int[] nums) {
    Map<Integer, Integer> storage = new HashMap<>();
    boolean tie = false;
    int maxCount = -1;
    int maxElement = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        int temp = storage.getOrDefault(nums[i], 0) + 1;
        if (temp > maxCount) {
          maxCount = temp;
          maxElement = nums[i];
          tie = false;
        } else if (temp == maxCount) {
          if (nums[i] < maxElement) {
            maxElement = nums[i];
          }
          tie = true;
        }
        storage.put(nums[i], temp);
      }
    }
    return maxElement;
  }
}
