class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        for alphabet in range(ord('a'), ord('z')+1):
            if chr(alphabet) not in sentence:
                return False
        return True
