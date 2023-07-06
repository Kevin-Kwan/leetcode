class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if (calcSum(nums,0,n)<target) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int sum = 0;
        int minLength = n;
        if (sum>=target) {
            return 1;
        }
        while (j<n) {
            sum+=nums[j];
            while(sum>=target) {
                sum-=nums[i];
                minLength = Math.min(j-i+1,minLength);
                i++;
            }
            j++;
        }

        return minLength;
    }
    public int calcSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i<end; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
