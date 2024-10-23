class Solution {
    public boolean isThree(int n) {
        if (n%2 == 0) {
            if (n == 4) {
                return true;
            }
            return false;
        } else {
            int root = (int)Math.sqrt(n);
            if (root * root != n) {
                return false;
            }

            int count = 0;
            for (int i = 2; i<root; i++) {
                if (root%i==0) {
                    return false;
                }
            }
            return root > 1;
        }
    }
}
