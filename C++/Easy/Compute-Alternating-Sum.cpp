class Solution {
public:
    int alternatingSum(vector<int>& nums) {
        int answer = 0;
        for (int i = 0; i<nums.size(); i++) {
            if (i%2==0) {
                answer+=nums[i];
            } else {
                answer-=nums[i];
            }
        }
        return answer;
    }
};
