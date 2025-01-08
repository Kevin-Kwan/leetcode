class Solution:
    def countPrefixSuffixPairs(self, words: List[str]) -> int:
        n = len(words)
        count = 0
        for i in range(n):
            str1 = words[i]
            len1 = len(str1)
            for j in range(i+1,n):
                str2 = words[j]
                if len1<=len(str2) and str1 == str2[-len1:] and str1 == str2[:len1]:
                    count+=1
        return count
