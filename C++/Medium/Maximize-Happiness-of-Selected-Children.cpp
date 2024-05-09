class Solution {
public:
    long long maximumHappinessSum(vector<int>& happiness, int k) {
        sort(happiness.begin(),happiness.end(), std::greater<>());
        long answer = 0;
        for (int i = 0; i<k; i++) {
            answer+=max(happiness[i]-i,0);
        }
        return answer;
    }
};
