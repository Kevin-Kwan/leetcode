class Solution {
    public int arraySign(int[] nums) {
        int x = Integer.signum(nums[0]);
        for (int i = 1; i<nums.length; i++) {
            x*=Integer.signum(nums[i]);
        }
        if (x == 0) {
            return 0;
        }
        return x>0 ? 1: -1;
    }
}
