class Solution {
  public int countNegatives(int[][] grid) {
    int answer = 0;
    for (int m = 0; m < grid.length; m++) {
      for (int n = 0; n < grid[0].length; n++) {
        if (grid[m][n] < 0) {
          answer++;
        }
      }
    }
    return answer;
  }
}
