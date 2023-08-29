class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n = s.length();
        if (n!=words.size())  {
            return false;
        }
        for (int i = 0; i<n; i++) {
            if (s.charAt(i)!=words.get(i).charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
