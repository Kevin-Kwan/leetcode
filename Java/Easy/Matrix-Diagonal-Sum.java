class Solution {
  public int diagonalSum(int[][] mat) {
    int answer = 0;
    for (int i = 0; i < mat.length; i++) {
      if (i == mat.length - i - 1) {
        answer += mat[i][i];
      } else {
        answer += mat[i][i] + mat[i][mat.length - i - 1];
      }
    }
    return answer;
  }
}
