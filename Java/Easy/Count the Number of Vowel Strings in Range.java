class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int answer = 0;
        for (int i = left; i<=right; i++) {
            if ((words[i].charAt(0)=='a' || words[i].charAt(0)=='e' || words[i].charAt(0)=='i' || words[i].charAt(0)=='o' || words[i].charAt(0)=='u') && (words[i].charAt(words[i].length()-1)=='a' || words[i].charAt(words[i].length()-1)=='e' || words[i].charAt(words[i].length()-1)=='i' || words[i].charAt(words[i].length()-1)=='o' || words[i].charAt(words[i].length()-1)=='u')) {
                answer++;
                continue;
            } else {
                continue;
            }
        }
        return answer;
    }
}
