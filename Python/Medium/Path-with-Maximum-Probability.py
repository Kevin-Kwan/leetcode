class Solution:
    def maxProbability(self, n: int, edges: List[List[int]], succProb: List[float], start_node: int, end_node: int) -> float:
        adj = {i:[] for i in range(n)}
        for i in range(len(edges)):
            source, target = edges[i]
            adj[source].append([succProb[i],target])
            adj[target].append([succProb[i],source])
        
        pq = [[-1,start_node]]
        visited = set()
        while pq:
            prob, node = heapq.heappop(pq)
            visited.add(node)
            if node == end_node:
                return -1 * prob
            for nextProb, neighbor in adj[node]:
                if neighbor not in visited:
                    heapq.heappush(pq, [prob * nextProb, neighbor])
        return 0
