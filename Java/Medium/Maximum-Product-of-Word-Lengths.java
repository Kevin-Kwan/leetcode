class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] masks = new int[n];
        int[] lens = new int[n];
        
        for (int i = 0; i < n; ++i) {
            for (char c : words[i].toCharArray()) {
                masks[i] |= 1 << (c - 'a');
            }
            lens[i] = words[i].length();
        }
        
        int maxVal = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ((masks[i] & masks[j]) == 0) {
                    maxVal = Math.max(maxVal, lens[i] * lens[j]);
                }
            }
        }
        
        return maxVal;
    }
}
