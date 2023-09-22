class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int sL = s.length();
        int counter = 0;
        for (int i = 0; i<n; i++) {
            if (counter<sL) {
                if (s.charAt(counter)==t.charAt(i)) {
                    counter++;
                }
            } else {
                return sL==counter;
            }
        }
        return sL==counter;
    }
}
