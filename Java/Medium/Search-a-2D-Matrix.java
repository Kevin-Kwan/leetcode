class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] theArray = findRow(matrix,target);
        if (theArray == null) {
            return false;
        } else {
            return search(theArray,target);
        }
    }

    public int[] findRow(int[][] matrix, int target) {
        int toprow = 0;
        int bottomrow = matrix.length-1;
        while (toprow<=bottomrow) {
            int midrow = (toprow+bottomrow)/2;
            int midleft = matrix[midrow][0];
            int midright = matrix[midrow][matrix[midrow].length-1];
            if (target>=midleft && target<=midright) {
                return matrix[midrow];
            } else if (target<midleft) {
                bottomrow = midrow-1;
            } else if (target>midright) {
                toprow = midrow+1;
            }
        }
        return null;
    }

    public boolean search(int[] nums, int target) {
        int front = 0;
        int end = nums.length-1;
        while (front<=end) {
            int mid = (end+front)/2;
            if (target == nums[mid]) {
                return true;
            }
            if (target > nums[mid]) {
                front = ++mid;
            } else if (target < nums[mid]) {
                end = --mid;
            }

        }
        return false;
    }
}
