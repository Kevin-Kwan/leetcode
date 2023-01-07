class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int answer = 0;
        int remainingGas = 0;
        for (int i = 0; i<gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            remainingGas += (gas[i]-cost[i]);
            if (remainingGas < 0) {
                remainingGas = 0;
                answer = i+1;
            }
        }
        if (totalCost > totalGas) {
            return -1;
        }
        return answer;
    }
}
