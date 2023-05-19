class Solution {
  public int addDigits(int num) {
    int answer = num;
    String temp = Integer.toString(num);
    while (temp.length() != 1) {
      answer = 0;
      for (int i = 0; i < temp.length(); i++) {
        answer += temp.charAt(i) - '0';
      }
      temp = Integer.toString(answer);
    }
    return answer;
  }
}
