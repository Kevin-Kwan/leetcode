class Solution {
    public int[] sumZero(int n) {
        int[] answer = new int[n];
        for (int i = 1; i<n; i+=2) {
            answer[i-1]=i;
            answer[i]=-i;
        }
        return answer;
    }
}
