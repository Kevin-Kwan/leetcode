class Solution:
    def makeEqual(self, words: List[str]) -> bool:
        charCounter = {}
        n=len(words)
        for word in words:
            for letter in word:
                charCounter[letter] = charCounter.get(letter,0)+1
        for key, value in charCounter.items():
            if not (value/n).is_integer():
                return False
        return True
