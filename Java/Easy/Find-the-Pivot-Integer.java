class Solution {
  public int pivotInteger(int n) {
    if (n == 1) {
      return 1;
    }
    int rightSum = ((n + 1) * (n)) / 2;
    int leftSum = 1;
    for (int i = 1; i < n; i++) {
      if (rightSum == leftSum) {
        return i;
      }
      leftSum += i + 1;
      rightSum -= i;
    }
    return -1;
  }
}
