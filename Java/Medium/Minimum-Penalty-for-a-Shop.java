class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] customersMissed = new int[n];
        int runningPenalty = 0;
        for (int i = 0; i<n; i++) {
            if (customers.charAt(i)=='Y') {
                customersMissed[i]=1;
                runningPenalty++;
            }
        }
        int minP = runningPenalty;
        int minHour = 0;
        for (int i = 1; i<=n; i++) {
            if (customersMissed[i-1]==1) {
                runningPenalty--;
            } else {
                runningPenalty++;
            }
            if (minP>runningPenalty) {
                minP = runningPenalty;
                minHour = i;
            }
        }
        return minHour;
    }
}
