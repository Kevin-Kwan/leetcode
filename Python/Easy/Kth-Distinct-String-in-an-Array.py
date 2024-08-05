class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        counts = Counter(arr)
        kth = 1
        for string in counts:
            if counts[string] == 1:
                if kth == k:
                    return string
                kth+=1
        return ""
