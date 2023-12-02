class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        charSet = Counter(chars)
        answer = 0
        for word in words:
            answer += len(word)
            counter = {}
            for char in word:
                counter[char]=counter.get(char,0)+1
                if char not in charSet or counter[char]>charSet[char]:
                    answer -= len(word)
                    break
        return answer
