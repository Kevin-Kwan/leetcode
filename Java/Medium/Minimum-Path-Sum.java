class Solution {
    public int minPathSum(int[][] grid) {
        for (int i = 1; i<grid[0].length; i++) {
            grid[0][i] += grid[0][i-1];
        }
        for (int j = 1; j<grid.length; j++) {
            grid[j][0] += grid[j-1][0];
        }
        for (int row = 1; row < grid.length; row++) {
            for (int column = 1; column < grid[0].length ; column++) {
                grid[row][column] += (grid[row][column-1]>grid[row-1][column]) ? grid[row-1][column] : grid[row][column-1] ;
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
