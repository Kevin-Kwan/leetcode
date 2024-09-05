class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        newStones = []
        for stone in stones:
            heapq.heappush(newStones,-stone)
        while len(newStones)>1:
            y = heapq.heappop(newStones)
            x = heapq.heappop(newStones)
            if y!=x:
                heapq.heappush(newStones, -(x-y))
        return -heapq.heappop(newStones) if newStones else 0

