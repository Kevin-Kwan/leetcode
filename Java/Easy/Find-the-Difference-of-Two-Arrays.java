class Solution {
  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<List<Integer>> answer = new LinkedList<>();
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    for (int num1 : nums1) {
      set1.add(num1);
    }
    for (int num2 : nums2) {
      set2.add(num2);
    }
    answer.add(new LinkedList<>(set1));
    answer.get(0).removeAll(set2);
    answer.add(new LinkedList<>(set2));
    answer.get(1).removeAll(set1);
    return answer;
  }
}
