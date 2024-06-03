class Solution {
public:
    int appendCharacters(string s, string t) {
        int n = t.size();
        int tP = 0;
        for (int sP = 0; sP<s.size(); sP++) {
            if (tP<n && s[sP]==t[tP]) {
                tP++;
            }
        }
        return n-tP;
    }
};
