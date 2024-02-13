class Solution(object):
    def firstPalindrome(self, words):
        """
        :type words: List[str]
        :rtype: str
        """
        for word in words:
            if self.checkPalindrome(word):
                return word
        return ""
    def checkPalindrome(self, word):
        n = len(word)
        for i in range(n):
            if word[i]!=word[n-i-1]:
                return False
        return True
