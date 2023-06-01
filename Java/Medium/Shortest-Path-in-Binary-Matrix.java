class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0]==1 || grid[n-1][n-1]==1) {
            return -1;
        }
        Queue<int[]> queue = new LinkedList<>();
        //available directions in the x-axis and y-axis
        int[] xAxis = new int[]{-1, 0, 1};
        int[] yAxis = new int[]{-1, 0, 1};
        // mark top left as visited
        queue.offer(new int[]{0,0,1});
        grid[0][0] = 1;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int numSteps = curr[2];
            if (x==n-1 && y==n-1) {
                return numSteps;
            }
            // calculate and add all other possible moves and add them to queue
            for(int i = 0;i<3;i++){
                for(int j = 0;j<3;j++){
                    int newX = x + xAxis[i];
                    int newY = y + yAxis[j];
                    // if within bounds
                    if (newX >= 0 && newX < n && newY >= 0 && newY < n && grid[newX][newY] == 0) {
                        queue.offer(new int[]{newX, newY, numSteps + 1});
                        // mark as visited
                        grid[newX][newY] = 1;
                    }
                }
            }


        }
        return -1;



    }
}
