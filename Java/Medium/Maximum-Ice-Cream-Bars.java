class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int answer = costs.length;
        for (int i = 0; i<answer; i++) {
            if (coins-costs[i] < 0) {
                return i;
            } else {
                coins-=costs[i];
            }
        }
        return answer;
    }
}
