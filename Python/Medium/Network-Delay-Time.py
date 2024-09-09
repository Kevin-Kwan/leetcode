class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        adj = {i: [] for i in range(1, n+1)}
        for source, target, time in times:
            adj[source].append([target, time])

        heap = []
        heapq.heappush(heap,[0,k])
        visited = set()
        ans = 0
        while heap:
            dist, node = heapq.heappop(heap)
            if node not in visited:
                visited.add(node)
                ans = dist
                for target, time in adj[node]:
                    heapq.heappush(heap,[dist+time,target])
        return ans if len(visited) == n else -1
