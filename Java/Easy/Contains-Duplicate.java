class Solution {
  public boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> dictNums = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (dictNums.getOrDefault(nums[i], 0) >= 1) {
        return true;
      } else {
        dictNums.put(nums[i], 1);
      }
    }
    return false;
  }
}
