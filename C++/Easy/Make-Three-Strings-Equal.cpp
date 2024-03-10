class Solution {
public:
    int findMinimumOperations(string s1, string s2, string s3) {
        int pointer = 0;
        int smallestLen = min(min(s1.size(),s2.size()),s3.size());
        while (s1[pointer] == s2[pointer] && s2[pointer] == s3[pointer] && pointer<smallestLen) {
            pointer++;
        }
        if (pointer == 0) {
            return -1;
        }
        return s1.size()-pointer + s2.size() - pointer + s3.size() - pointer;
    }
};
