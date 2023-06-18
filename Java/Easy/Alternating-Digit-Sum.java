class Solution {
    public int alternateDigitSum(int n) {
        int sign = Integer.toString(n).length()%2==0 ? -1:1;
        int answer = 0;
        while (n>0) {
            answer+=sign*(n%10);
            sign*=-1;
            n/=10;
        }
        return answer;
    }
}
