class Solution {
  public int[][] updateMatrix(int[][] mat) {
    Queue<int[]> q = new LinkedList<>();
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] == 0) {
          q.add(new int[] {i, j});
        } else {
          mat[i][j] = -1;
        }
      }
    }
    int[][] dirs = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    while (!q.isEmpty()) {
      int[] currentIndex = q.poll();
      for (int k = 0; k < 4; k++) {
        int rowY = currentIndex[0] + dirs[k][0];
        int colX = currentIndex[1] + dirs[k][1];
        if (rowY < 0
            || rowY == mat.length
            || colX < 0
            || colX == mat[0].length
            || mat[rowY][colX] != -1) {
          continue;
        }
        mat[rowY][colX] = mat[currentIndex[0]][currentIndex[1]] + 1;
        q.offer(new int[] {rowY, colX});
      }
    }
    return mat;
  }
}
