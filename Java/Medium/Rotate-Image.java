class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i<n;i++) {
            for (int j=0;j<i;j++) {
                int temp = matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        for (int row = 0; row<n; row++) {
            int left = 0;
            int right = n - 1;
            while (left<right) {
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
                left++;
                right--;
            }
        }
    }
}
