class Solution {
  public int repeatedNTimes(int[] nums) {
    int n = nums.length / 2;
    int answer = 0;
    HashMap<Integer, Integer> counter = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);
    }
    for (int key : counter.keySet()) {
      if (counter.get(key) == n) {
        answer = key;
      }
    }
    return answer;
  }
}
