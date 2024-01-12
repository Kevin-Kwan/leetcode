class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        vowels = set('aeiouAEIOU')
        n = len(s) // 2
        numLeft = sum(1 for c in s[:n] if c in vowels)
        numRight = sum(1 for c in s[n:] if c in vowels)
        return numLeft == numRight
            
