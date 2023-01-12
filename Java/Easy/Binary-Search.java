class Solution {
    public int search(int[] nums, int target) {
        int front = 0;
        int end = nums.length-1;
        while (front<=end) {
            int mid = (end+front)/2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                front = ++mid;
            } else if (target < nums[mid]) {
                end = --mid;
            }

        }
        return -1;
    }
}
