class Solution {
    public boolean isPalindrome(int x) {
        boolean palin = true;
        int reversedNumber = 0;
        int currentNumber = x;
        if (x<0)
        {
            palin = false;
        }
        else
        {
            while (currentNumber!=0)
            {   
                reversedNumber = (currentNumber % 10) + 10 * reversedNumber;
                currentNumber = currentNumber / 10;
            }
            if (x!=reversedNumber)
            {
                palin = false;
            }
        }
        return palin;
    }
}
