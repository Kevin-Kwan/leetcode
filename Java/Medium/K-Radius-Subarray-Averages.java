class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] answer = new int[n];
        int range = 2*k+1;
        Arrays.fill(answer,-1);
        if (range>n) {
            return answer;
        }
        long runningSum = 0;
        for (int i=0; i<range; i++) {
            runningSum+=nums[i];
        }
        answer[k]=(int)(runningSum/range);
        for (int i = k + 1; i<n-k; i++) {
            runningSum+=nums[i+k]-nums[i-k-1];
            answer[i]=(int)(runningSum/range);
        }
        return answer;
    }
}
