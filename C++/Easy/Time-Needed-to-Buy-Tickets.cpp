class Solution {
public:
    int timeRequiredToBuy(vector<int>& tickets, int k) {
        int time = 0;
        int i = 0;
        while (i<tickets.size()) {
            if (tickets[i] < tickets[k]) {
                time += tickets[i];
            } else if (i <= k && tickets[i] >= tickets[k]) {
                time += tickets[k];
            } else {
                time += tickets[k] - 1;
            }
            i++;
        }
        return time;
    }
};
