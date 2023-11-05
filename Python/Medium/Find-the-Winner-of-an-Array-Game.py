class Solution:
    def getWinner(self, arr: List[int], k: int) -> int:
        arrMax = max(arr)
        larger = arr[0]
        winCount = 0
        if larger == arrMax:
            return larger
        for i in range(1, len(arr)):
            if arr[i] > larger:
                larger = arr[i]
                winCount = 1
            else:
                winCount += 1
            if winCount == k:
                break
        return larger
