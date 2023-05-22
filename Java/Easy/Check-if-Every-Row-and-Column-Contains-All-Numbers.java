class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int r = 0; r < n; r++) {
            int[] dict = new int[n];
            for (int c = 0; c < n; c++) {
                if (++dict[matrix[r][c]-1]>=2) {
                    return false;
                }
            }
        }
        for (int c = 0; c < n; c++) {
            int[] dict = new int[n];
            for (int r = 0; r < n; r++) {
                if (++dict[matrix[r][c]-1]>=2) {
                    return false;
                }
            }
        }
        return true;
    }
}
