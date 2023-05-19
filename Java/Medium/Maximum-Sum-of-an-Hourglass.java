class Solution {
  public int maxSum(int[][] grid) {
    int max = -1;
    for (int i = 1; i < grid.length - 1; i++) {
      for (int j = 1; j < grid[0].length - 1; j++) {
        int hourglassValue =
            grid[i][j]
                + grid[i - 1][j - 1]
                + grid[i - 1][j]
                + grid[i - 1][j + 1]
                + grid[i + 1][j - 1]
                + grid[i + 1][j]
                + grid[i + 1][j + 1];
        if (hourglassValue > max) {
          max = hourglassValue;
        }
      }
    }
    return max;
  }
}
