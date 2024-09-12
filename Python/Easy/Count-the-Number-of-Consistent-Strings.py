class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        letterSet = set(allowed)
        ans = len(words)
        for word in words:
            for c in word:
                if c not in letterSet:
                    ans-=1
                    break
        return ans
