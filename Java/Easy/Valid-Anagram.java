class Solution {
  public boolean isAnagram(String s, String t) {
    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();
    Arrays.sort(sArray);
    Arrays.sort(tArray);
    if (sArray.length != tArray.length) {
      return false;
    }
    for (int i = 0; i < sArray.length; i++) {
      if (sArray[i] != tArray[i]) {
        return false;
      }
    }
    return true;
  }
}
