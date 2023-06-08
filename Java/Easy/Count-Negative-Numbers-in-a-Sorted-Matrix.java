class Solution {
    public int countNegatives(int[][] grid) {
        int answer = 0;
        int mSize = grid.length;
        int nSize = grid[0].length;
        for (int m = 0; m<mSize; m++) {
            int index = findFirstNegative(grid[m]);
            if (index>=0) {
                answer+=nSize-index;
            }
        }
        return answer;
    }
    public static int findFirstNegative(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < 0) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}
