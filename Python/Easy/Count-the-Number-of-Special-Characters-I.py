class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        lowerCharSet = set()
        upperCharSet = set()
        for c in word:
            if c >= 'a' and c<= 'z':
                lowerCharSet.add(c)
            else:
                upperCharSet.add(c)
        answer = 0
        for c in lowerCharSet:
            if c.upper() in upperCharSet:
                answer+=1
        return answer
