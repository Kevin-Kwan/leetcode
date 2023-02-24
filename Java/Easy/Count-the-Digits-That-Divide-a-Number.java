class Solution {
    public int countDigits(int num) {
        String numToString = String.valueOf(num);
        int answer = 0;
        for (int i = 0; i<numToString.length();i++) {
            if (num%(numToString.charAt(i)-'0')==0) {
                answer++;
            }
        }
        return answer;
    }
}
