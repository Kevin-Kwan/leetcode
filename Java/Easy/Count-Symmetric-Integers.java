class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i<=high; i++) {
            if (checkSym(i)) {
                count++;
            }
        }
        return count;
    }
    public boolean checkSym(int num) {
        int length = String.valueOf(num).length(); 
        if (length%2!=0) {
            return false;
        }
        length/=2;
        int front = 0;
        int back = 0;
        for (int i = 0; i < length; i++) {
            front+= num % 10;
            num /= 10;
        }
        for (int i = 0; i < length; i++) {
            back+= num % 10;
            num /= 10;
        }
        return front==back;
    }
}
