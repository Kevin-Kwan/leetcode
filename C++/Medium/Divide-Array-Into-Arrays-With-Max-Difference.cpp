class Solution {
public:
    vector<vector<int>> divideArray(vector<int>& nums, int k) {
        int n = nums.size();
        sort(nums.begin(),nums.end());
        // row, then column
        vector<vector<int>> answer(n/3,vector<int>(3));
        for (int i = 0; i<n; i+=3) {
            if (k>=(nums[i+2] - nums[i])) {
                answer[i/3] = {nums[i], nums[i+1], nums[i+2]};
            } else {
                return vector<vector<int>>();
            }
        }
        return answer;
    }
};
