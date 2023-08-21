class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;
        while (i<=j) {
            char charI = s.charAt(i);
            char charJ = s.charAt(j);
            if (!Character.isLetterOrDigit(charI)) {
                i++;
            }
            else if (!Character.isLetterOrDigit(charJ)) {
                j--;
            } else {
                if (Character.toLowerCase(charI)!=Character.toLowerCase(charJ)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}
