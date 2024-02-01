class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        int n = arr.size();
        int lastNum = arr[n-1];
        int counter = 0;
        int numIter = 0;
        for (int i = 1; i<lastNum; i++) {
            if (arr[numIter]!=i) {
                if (++counter==k) {
                    return i;
                }
            } else {
                numIter++;
            }
        }
        return lastNum+(k-counter);
    }
};
