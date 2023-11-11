class Graph:

    def __init__(self, n: int, edges: List[List[int]]):
        self.n = n
        self.adj = [[] for _ in range(n)]
        for edge in edges:
            self.addEdge(edge)

    def addEdge(self, edge: List[int]) -> None:
        from_node, to_node, edge_cost = edge
        self.adj[from_node].append((to_node, edge_cost))
        

    def shortestPath(self, node1: int, node2: int) -> int:
        # Dijkstra’s algorithm
        dist = [float('inf')] * self.n
        dist[node1] = 0
        queue = [(0, node1)]
        
        while queue:
            d, node = heapq.heappop(queue)
            if d != dist[node]:
                continue
            for neighbor, w in self.adj[node]:
                alt = dist[node] + w
                if alt < dist[neighbor]:
                    dist[neighbor] = alt
                    heapq.heappush(queue, (alt, neighbor))
                    
        return dist[node2] if dist[node2] != float('inf') else -1


# Your Graph object will be instantiated and called as such:
# obj = Graph(n, edges)
# obj.addEdge(edge)
# param_2 = obj.shortestPath(node1,node2)
