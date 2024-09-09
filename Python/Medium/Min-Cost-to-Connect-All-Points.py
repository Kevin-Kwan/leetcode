class Solution:
    def minCostConnectPoints(self, points: List[List[int]]) -> int:
        n = len(points)
        adj = {i:[] for i in range(n)}
        for i in range(n):
            xi, yi = points[i][0],points[i][1]
            for j in range(i+1, n):
                xj, yj = points[j][0],points[j][1]
                dist = self.calcManhattanDist(xi, yi, xj, yj)
                adj[i].append([dist, j])
                adj[j].append([dist, i])

        heap = [[0,0]]
        visited = set()
        dist = 0
        while len(visited) < n:
            cost, i = heapq.heappop(heap)
            if i not in visited:
                visited.add(i)
                dist += cost
                for otherCost, other in adj[i]:
                    if other not in visited:
                        heapq.heappush(heap,[otherCost,other])
        return dist

    def calcManhattanDist(self, xi, yi, xj, yj):
        return abs(xi-xj) + abs(yi-yj)
