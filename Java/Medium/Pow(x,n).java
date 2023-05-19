class Solution {
  public double myPow(double x, int n) {
    long newN = n;
    if (n < 0) {
      x = 1 / x;
      newN = -newN;
    }
    return helper(x, newN);
  }

  public double helper(double x, long n) {
    if (n == 0) {
      return 1;
    }
    if (x == 1) {
      return 1;
    }
    if (n % 2 == 0) {
      return helper(x * x, n / 2);
    } else {
      return x * helper(x, n - 1);
    }
  }
}
