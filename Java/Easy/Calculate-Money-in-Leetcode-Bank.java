class Solution {
    public int totalMoney(int n) {
        int numWeeks = n/7;
        int extraDays = n%7;
        // calculate the amount from the extra days
        int start = numWeeks+1;
        int end = extraDays + numWeeks;
        int extra = ((start+end)*(end-start+1))/2;
        // calculate the $7*week number for each week
        int extra7s = (numWeeks-1)*(numWeeks)/2;
        // final balance
        return 28*numWeeks+7*extra7s+extra;
    }
}
