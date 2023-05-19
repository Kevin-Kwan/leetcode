class Solution {
  public String reverseWords(String s) {
    String[] tempS = s.trim().split("\\s+");
    String answer = "";
    for (int i = tempS.length - 1; i > 0; i--) {
      answer += tempS[i] + " ";
    }
    return answer + tempS[0];
  }
}
