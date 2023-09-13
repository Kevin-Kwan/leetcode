class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();
        for (List<Integer> num:nums) {
            for (int i = num.get(0); i<=num.get(num.size()-1); i++) {
                set.add(i);
            }
        }
        return set.size();
    }
}
