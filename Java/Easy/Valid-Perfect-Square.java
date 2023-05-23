class Solution {
    public boolean isPerfectSquare(int num) {
        int theNum = (int)Math.sqrt(num);
        return (theNum*theNum==num);
    }
}
