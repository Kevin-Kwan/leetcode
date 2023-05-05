class Solution {
    public int maxVowels(String s, int k) {
        int localmax = 0;
        int totalmax = 0;
        for (int j = 0; j<k; j++) {
            if (s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u') {
                totalmax++;
                localmax++;
            }
        }
        for (int i = 1; i<s.length()-k+1; i++) {
            if (s.charAt(i-1)=='a' || s.charAt(i-1)=='e' || s.charAt(i-1)=='i' || s.charAt(i-1)=='o' || s.charAt(i-1)=='u') {
                localmax--;
            }
            if (s.charAt(i+k-1)=='a' || s.charAt(i+k-1)=='e' || s.charAt(i+k-1)=='i' || s.charAt(i+k-1)=='o' || s.charAt(i+k-1)=='u') {
                localmax++;
            }
            if (localmax>totalmax) {
                totalmax=localmax;
            }
        }
        return totalmax;
    }
}
