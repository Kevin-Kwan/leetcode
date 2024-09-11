class Solution:
    def countCompleteComponents(self, n: int, edges: List[List[int]]) -> int:
        adj = {i:[] for i in range(n)}
        for a, b in edges:
            adj[a].append(b)
            adj[b].append(a)
        numComponents = 0
        visited = set()

        def dfs(node):
            counter.add(node)
            for neighbor in adj[node]:
                if neighbor not in visited:
                    visited.add(neighbor)
                    dfs(neighbor)
        
        for i in range(n):
            if i not in visited:
                visited.add(i)
                counter = set() 
                dfs(i)
                numEdgesInComponent = 0
                for node in counter:
                    numEdgesInComponent += len(adj[node])
                if len(counter)*(len(counter)-1) == numEdgesInComponent:
                    numComponents+=1
        return numComponents
