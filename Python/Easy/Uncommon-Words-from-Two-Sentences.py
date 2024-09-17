class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        words = s1.split() + s2.split()
        counts = Counter(words)
        return [word for word in counts if counts[word]==1]
