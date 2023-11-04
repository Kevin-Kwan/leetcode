class Solution:
    def getLastMoment(self, n: int, left: List[int], right: List[int]) -> int:
        rightMax = n - min(right) if right else 0
        leftMax = max(left) if left else 0
        return max(rightMax, leftMax)
