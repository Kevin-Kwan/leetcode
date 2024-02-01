class Solution {
public:
    int countKeyChanges(string s) {
        int n = s.length();
        int count = 0;
        char prev = tolower(s[0]);
        for (int i = 1; i<n; i++) {
            if (tolower(s[i])!=prev) {
                prev=tolower(s[i]);
                count++;
            }
        }
        return count;
    }
};
