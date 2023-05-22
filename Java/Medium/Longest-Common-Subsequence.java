class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dptable = new int[text1.length()+1][text2.length()+1];
        for (int i = 1; i<=text1.length(); i++) {
            for (int j = 1; j<=text2.length();j++) {
                if (text1.charAt(i-1)==text2.charAt(j-1)) {
                    dptable[i][j]=dptable[i-1][j-1]+1;
                } else {
                    dptable[i][j]=Math.max(dptable[i-1][j],dptable[i][j-1]);
                }
            }
        }
        return dptable[text1.length()][text2.length()];
    }
}
