class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];
        int posOfC = -n;
        // calc the distance to the right of the posOfC
        for (int i = 0; i<n; i++) {
            if (s.charAt(i)==c) {
                posOfC = i;
            }
            answer[i] = i-posOfC;
        }
        for (int i = posOfC - 1; i>=0; i--) {
            if (s.charAt(i)==c) {
                posOfC = i;
            }
            answer[i] = Math.min(answer[i],posOfC-i);
        }
        return answer;

    }
}
