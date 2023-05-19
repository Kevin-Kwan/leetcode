class Solution {
  public int countSegments(String s) {
    int answer = 0;
    String[] arr = s.split("\\s+");
    // System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].length() != 0) {
        answer++;
      }
    }
    return answer;
  }
}
