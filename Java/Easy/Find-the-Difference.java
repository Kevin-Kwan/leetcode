class Solution {
    public char findTheDifference(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        if (s.length() == 0) {
            return t.charAt(0);
        }
        for (int i = 0; i<s.length();i++) {
            if (sArray[i]!=tArray[i]) {
                return tArray[i];
            }
        }
        return tArray[t.length()-1];
        
    }
}
