class Solution {
  public void reverseString(char[] s) {
    char[] answer = Arrays.copyOf(s, s.length);
    for (int i = 0; i < s.length; i++) {
      s[i] = answer[s.length - 1 - i];
    }
  }
}
