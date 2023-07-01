class Solution {
    public int fillCups(int[] amount) {
        int max = 0;
        int sum = 0;
        for (int cupAmount:amount) {
            max = Math.max(max,cupAmount);
            sum+=cupAmount;
        }
        return Math.max(max,(sum+1)/2);

    }
}
