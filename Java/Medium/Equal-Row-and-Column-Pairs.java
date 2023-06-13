class Solution {
    public int equalPairs(int[][] grid) {
        int answer = 0;
        int[][] transposedMatrix = transpose(grid);
        for (int i = 0; i<grid.length; i++) {
            for (int j = 0; j<grid.length; j++) {
                if (Arrays.equals(grid[i],transposedMatrix[j])) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public int[][] transpose(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}
