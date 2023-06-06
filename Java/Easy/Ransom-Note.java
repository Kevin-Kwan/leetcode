class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] magDict = new int[26];
        for(char c:magazine.toCharArray()){
            magDict[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            if(magDict[c-'a']==0 ) {
                return false;
            }
            magDict[c-'a']--;
        }
        return true;
    }
}
