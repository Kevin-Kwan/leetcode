class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int max = 0;
        while (mainTank>0) {
            if (mainTank>=5) {
                max+=50;
                mainTank-=5;
                if (additionalTank>0) {
                    additionalTank--;
                    mainTank++;
                }
            } else {
                max+=mainTank*10;
                mainTank=0;
            }
        }
        return max;
    }
}
