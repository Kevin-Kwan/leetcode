class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int increment = nums[n-1]++;
        int answer = nums[n-1];
        for (int i = 1; i<k; i++) {
            answer+=increment++;
        }
        return answer;
    }
}
