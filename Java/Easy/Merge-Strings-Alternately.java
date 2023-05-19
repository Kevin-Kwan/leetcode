class Solution {
  public String mergeAlternately(String word1, String word2) {
    int i = 0;
    StringBuilder answer = new StringBuilder();
    int w1length = word1.length();
    int w2length = word2.length();
    while (i < w1length && i < w2length) {
      answer.append(word1.charAt(i)).append(word2.charAt(i++));
    }
    answer.append(word1.substring(i, w1length)).append(word2.substring(i, w2length));
    return answer.toString();
  }
}
