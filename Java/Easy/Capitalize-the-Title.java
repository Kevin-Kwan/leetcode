class Solution {
  public String capitalizeTitle(String title) {
    String[] arr = title.split(" ");
    String answer = "";
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].length() < 3) {
        answer += arr[i].toLowerCase();
      } else {
        if (i != arr.length - 1) {}

        answer += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
      }
      if (i != arr.length - 1) {
        answer += " ";
      }
    }
    return answer;
  }
}
