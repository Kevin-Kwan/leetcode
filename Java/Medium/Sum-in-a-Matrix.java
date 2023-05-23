class Solution {
    public int matrixSum(int[][] nums) {
        int answer = 0;
        int n = nums.length;
        int m = nums[0].length;
        for (int i = 0; i<n; i++) {
            Arrays.sort(nums[i]);
        }
        for (int c = m-1; c>=0; c--) {
            int max = 0;
            for (int r = n - 1; r>=0; r--) {
                if (nums[r][c]>max) {
                   max = nums[r][c];
                }
            }
            answer+=max;
        }
        return answer;
    }
}
