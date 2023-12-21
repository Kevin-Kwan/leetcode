class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        points.sort(key=lambda x: x[0])

        maxWidth = 0

        for i in range(0, len(points)-1):
            width = points[i+1][0] - points[i][0]
            maxWidth = max(maxWidth, width)

        return maxWidth
