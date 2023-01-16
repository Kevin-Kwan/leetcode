class Solution {
    public int removeElement(int[] nums, int val) {
        int finalLen = 0;
        for (int i = 0, j = 0 ; j<nums.length; j++) {
            if (nums[j]!=val) {
                nums[i]=nums[j];
                i++;
                finalLen = i;
            }
        }
        return finalLen;
    }
}
