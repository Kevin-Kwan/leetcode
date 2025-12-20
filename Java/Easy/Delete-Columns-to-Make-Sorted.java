class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length; // rows
        int m = strs[0].length(); // cols
        int answer = 0;
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n-1; j++) {
                if (strs[j].charAt(i)>strs[j+1].charAt(i)) {
                    answer++;
                    break;
                }
            }
        } 
        return answer;
    }
}
