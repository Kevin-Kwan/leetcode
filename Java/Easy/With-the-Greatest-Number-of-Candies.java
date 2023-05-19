class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> answer = new LinkedList<>();
    int max = candies[0];
    for (int candy : candies) {
      if (candy > max) {
        max = candy;
      }
    }
    for (int i = 0; i < candies.length; i++) {
      answer.add(candies[i] + extraCandies >= max);
    }
    return answer;
  }
}
