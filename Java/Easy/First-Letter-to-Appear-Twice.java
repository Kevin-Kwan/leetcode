class Solution {
  public char repeatedCharacter(String s) {
    int[] smallDict = new int[26];
    for (int i = 0; i < s.length(); i++) {
      if (++smallDict[s.charAt(i) - 'a'] == 2) {
        return s.charAt(i);
      }
    }
    return 0;
  }
}
