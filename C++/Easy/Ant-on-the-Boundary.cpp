class Solution {
public:
    int returnToBoundaryCount(vector<int>& nums) {
        int counts = 0;
        int runningSum = 0;
        for (int i = 0; i<nums.size(); i++) {
            if ((runningSum += nums[i]) == 0) {
                counts++;
            }
        }
        return counts;
    }
};
