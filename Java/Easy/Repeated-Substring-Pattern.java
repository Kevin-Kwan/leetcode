class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubleS = s + s;
        String subDouble = doubleS.substring(1,doubleS.length()-1);
        return subDouble.contains(s);
    }
}
