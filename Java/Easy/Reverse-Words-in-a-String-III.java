class Solution {
  public String reverseWords(String s) {
    String[] arr = null;
    arr = s.split(" ");
    String answer = "";
    // StringBuilder builder = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      StringBuilder builder = new StringBuilder();
      builder.append(arr[i]);
      builder.reverse();
      answer += builder.toString();
      if (i != arr.length - 1) {
        answer += " ";
      }
    }
    return answer;
  }
}
