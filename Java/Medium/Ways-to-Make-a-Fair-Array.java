class Solution {
    public int waysToMakeFair(int[] nums) {
        int sumOdd = 0;
        int sumEven = 0;
        int answer = 0;
        int n = nums.length;
        int[] evenSums = new int[n];
        int[] oddSums = new int[n];
        for (int i = 0; i<n; i++) {
            if (i%2==0) {
                sumEven+=nums[i];
            } else {
                sumOdd+=nums[i];
            }
            evenSums[i]=sumEven;
            oddSums[i]=sumOdd;
        }
        for (int i = 0; i<n; i++) {
            int tempEvenSum = 0;
            int tempOddSum = 0;
            if (i==0) {
                tempOddSum = evenSums[n-1]-evenSums[0];
                tempEvenSum=oddSums[n-1];
            } else {
                tempOddSum = evenSums[n-1] - evenSums[i] + oddSums[i-1];
                tempEvenSum = oddSums[n-1] - oddSums[i] + evenSums[i-1];
            }
            if (tempOddSum == tempEvenSum) {
                answer++;
            }
        }
        return answer;
    }
}
