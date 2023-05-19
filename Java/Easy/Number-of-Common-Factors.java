class Solution {
  public int commonFactors(int a, int b) {
    int min = a < b ? a : b;
    int answer = 0;
    for (int i = 1; i <= min; i++) {
      if (a % i == 0 && b % i == 0) {
        answer++;
      }
    }
    return answer;
  }
}
