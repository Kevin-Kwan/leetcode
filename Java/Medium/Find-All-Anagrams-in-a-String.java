class Solution {
  public List<Integer> findAnagrams(String s, String p) {
    char[] word = p.toCharArray();
    List<Integer> answer = new LinkedList<>();
    for (int i = 0; i < s.length() - p.length() + 1; i++) {
      if (anagramCheck(word, s.substring(i, i + p.length()))) {
        answer.add(i);
      }
    }
    return answer;
  }

  private boolean anagramCheck(char[] word, String toCheck) {
    int[] storage = new int[26];
    char[] check = toCheck.toCharArray();
    for (int i = 0; i < word.length; i++) {
      storage[word[i] - 97]++;
      storage[check[i] - 97]--;
    }
    for (int i = 0; i < 26; i++) {
      if (storage[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
