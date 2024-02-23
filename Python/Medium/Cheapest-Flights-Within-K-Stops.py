from queue import Queue
class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, k: int) -> int:
        adj = defaultdict(list)
        for flight in flights:
            adj[flight[0]].append((flight[1], flight[2]))
        prices = [float('inf') for _ in range(n)]
        prices[src] = 0
        stops = 0
        q = Queue()
        q.put((src,0))
        while (not q.empty() and stops<=k):
            size = q.qsize()
            for i in range(size):
                curr, cost = q.get()
                for neighbor, price in adj[curr]:
                    totalCost = cost + price
                    if totalCost < prices[neighbor]:
                        prices[neighbor] = totalCost
                        q.put((neighbor,totalCost))
            stops += 1
        return prices[dst] if prices[dst] != float('inf') else -1
