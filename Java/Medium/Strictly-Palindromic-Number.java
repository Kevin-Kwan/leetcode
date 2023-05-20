class Solution {
  public boolean isStrictlyPalindromic(int n) {
    for (int i = 2; i <= (n - 2); i++) {
      if (!(Integer.toString(n, i))
          .equals(new StringBuilder(Integer.toString(n, i)).reverse().toString())) {
        return false;
      }
    }
    return true;
  }
}
