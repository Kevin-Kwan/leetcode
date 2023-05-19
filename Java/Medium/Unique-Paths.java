class Solution {
  public int uniquePaths(int m, int n) {
    int[][] table = new int[m][n];
    for (int r = 0; r < m; r++) {
      for (int c = 0; c < n; c++) {
        if (r == 0 || c == 0) {
          table[r][c] = 1;
        } else {
          table[r][c] = table[r - 1][c] + table[r][c - 1];
        }
      }
    }
    return table[m - 1][n - 1];
  }
}
