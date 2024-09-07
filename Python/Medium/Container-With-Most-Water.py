class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        L = 0
        R = n-1
        maxArea = 0

        while (L<R):
            w = R-L
            h = min(height[R], height[L])
            area = w * h
            maxArea = max(area, maxArea)
            if height[R]>height[L]:
                L+=1
            else:
                R-=1
        return maxArea
