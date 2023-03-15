class Solution {
    public int pivotIndex(int[] nums) {
        int index = 0;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i<nums.length; i++) {
            rightSum+=nums[i];
        }
        if (leftSum == rightSum) {
            return index;
        } else {
            for (int i = 1; i<nums.length; i++) {
                leftSum += nums[i-1];
                rightSum -= nums[i];
                if (leftSum == rightSum) {
                    return i;
                }
            }
        }
        return -1;
    }
}
