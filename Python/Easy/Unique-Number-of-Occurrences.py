class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        counts = Counter(arr)
        uniqueCheck = set()
        for value in counts.values():
            if value in uniqueCheck:
                return False
            uniqueCheck.add(value)
        return True
