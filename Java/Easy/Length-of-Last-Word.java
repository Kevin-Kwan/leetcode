class Solution {
    public int lengthOfLastWord(String s) {
        String[] arrayOfWords = s.split(" ");
        return arrayOfWords[arrayOfWords.length-1].length();
    }
}
