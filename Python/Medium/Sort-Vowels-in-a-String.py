class Solution:
    def sortVowels(self, s: str) -> str:
        vowelString = []
        indicies = []
        for i in range(len(s)):
            if self.is_vowel(s[i]):
                vowelString.append(s[i])
                indicies.append(i)
        print(vowelString)
        vowelString.sort()
        s = list(s)
        for i in range(len(indicies)):
            s[indicies[i]] = vowelString[i]
        return "".join(s)

    def is_vowel(self, char):
        return char in "AEIOUaeiou"
