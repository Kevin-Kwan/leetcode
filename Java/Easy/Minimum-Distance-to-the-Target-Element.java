class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int distance = n;
        for (int i = 0;i<n;i++) {
            if (nums[i]==target) {
                if (Math.abs(i-start)<distance) {
                    distance = Math.abs(i-start);
                }
            }
        }
        return distance;
    }
}
