class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m =obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] table = new int[m][n];
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) {
            return 0;
        }
        for (int r = 0; r<m; r++) {
            for (int c = 0; c<n; c++) {
                if (r == 0 && c == 0) {
                    table[r][c]=1;
                
                } else if (obstacleGrid[r][c]==1) {
                    table[r][c]=0;
                } else if (r == 0) {
                    if (table[r][c-1]==0) {
                        table[r][c]=0;
                    } else {
                        table[r][c] = 1;
                    }  
                } else if (c == 0) {
                    if (table[r-1][c]==0) {
                        table[r][c]=0;
                    } else {
                        table[r][c] = 1;
                    }  
                }  
                else {
                    table[r][c] = table[r-1][c]+table[r][c-1];
                }
            }
        }
        return table[m-1][n-1];
    }
}
