class Solution {
public:
    int maxDepth(string s) {
        int count = 0;
        int answer = 0;
        for (char c: s) {
            if (c== '(') {
                count++;
                answer=max(count,answer);
            } else if (c== ')') {
                count--;
            }
        }
        return answer;
    }
};
