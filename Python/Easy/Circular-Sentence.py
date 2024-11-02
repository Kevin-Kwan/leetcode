class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        words = sentence.split()
        n = len(words)
        for i in range(1,n+1):
            index = i%n
            if words[index][0] != words[index-1][-1]:
                return False
        return True
