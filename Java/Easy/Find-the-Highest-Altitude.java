class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for (int num:gain) {
            sum+=num;
            if (sum>max) {
                max = sum;
            }
        }
        return max;
    }
}
