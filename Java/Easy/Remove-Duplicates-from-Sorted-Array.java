class Solution {
  public int removeDuplicates(int[] nums) {
    TreeSet<Integer> hashset = new TreeSet<>();
    for (int i = 0; i < nums.length; i++) {
      hashset.add(nums[i]);
    }
    int j = 0;
    for (int element : hashset) {
      nums[j++] = element;
    }
    return hashset.size();
  }
}
