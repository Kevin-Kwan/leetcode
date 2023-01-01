class Solution {
    public boolean checkIfPangram(String sentence) {
        for (char alphabet = 'a';alphabet<= 'z'; alphabet++) {
            if (sentence.indexOf(alphabet)==-1) {
                return false;
            }
        }
        return true;
    }
}
