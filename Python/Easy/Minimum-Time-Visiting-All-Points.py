class Solution:
    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
        time = 0
        for i in range(1,len(points)):
            time+=abs(points[i-1][0]-points[i][0])+abs(points[i-1][1]-points[i][1])-min(abs(points[i-1][0]-points[i][0]),abs(points[i-1][1]-points[i][1]))
        return time
