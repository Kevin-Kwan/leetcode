class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]","");
        s = s.toLowerCase();
        String reverse = "";
        for(int i = s.length()-1; i>=0;i--) {
            reverse += s.charAt(i);
        }
        return s.equals(reverse);
    }
}
