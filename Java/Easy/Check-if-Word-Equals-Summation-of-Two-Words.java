class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return stringToValue(firstWord)+stringToValue(secondWord)==stringToValue(targetWord);
    }
    public int stringToValue(String word) {
        int answer = 0;
        int increment = 1;
        for (int i = 0; i<word.length(); i++) {
            answer+=(word.charAt(word.length()-1-i)-97)*increment;
            increment*=10;
        }
        return answer;
    }
}
