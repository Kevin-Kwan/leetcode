class Solution {
  public String arrangeWords(String text) {
    String[] sentence = text.split(" ");
    Arrays.sort(sentence, Comparator.comparingInt(String::length));
    String answer = "";
    answer += sentence[0].substring(0, 1).toUpperCase() + sentence[0].substring(1);
    for (int i = 1; i < sentence.length; i++) {
      answer += " " + sentence[i].toLowerCase();
    }
    return answer;
  }
}
