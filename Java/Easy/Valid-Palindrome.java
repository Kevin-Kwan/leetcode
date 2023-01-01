class Solution {
    public boolean isPalindrome(String s) {
        String noPunctSpace = s.replaceAll("\\s|[^a-zA-Z0-9]","");
        String newS = noPunctSpace.toLowerCase();
        boolean answer = true;
        for (int i = 0; i<(newS.length()-(newS.length()/2));i++) {
            if (newS.charAt(i)!=newS.charAt(newS.length()-1-i)) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
