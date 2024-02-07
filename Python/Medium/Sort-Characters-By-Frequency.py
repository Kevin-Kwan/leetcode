class Solution:
    def frequencySort(self, s: str) -> str:
        counts = Counter(s)
        counts = dict(sorted(counts.items(), key=lambda item: item[1], reverse=True))
        answer = ""
        for key, value in counts.items():
            while value>0:
                answer+=key
                value-=1
        return answer
