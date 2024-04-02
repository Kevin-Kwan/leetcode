class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if (s.size() != t.size()) {
            return false;
        }
        unordered_map<char, char> charMap;
        unordered_set<char> mappedChars;
        for (int i = 0; i < s.size(); i++) {
            char sChar = s[i];
            char tChar = t[i];
            if (charMap.count(sChar)) {
                if (charMap[sChar] != tChar) {
                    return false;
                }
            } else {
                if (mappedChars.count(tChar)) {
                    return false;
                }
                charMap[sChar] = tChar;
                mappedChars.insert(tChar);
            }
        }
        return true;
    }
};
