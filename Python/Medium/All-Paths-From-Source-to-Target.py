class Solution:
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        target = len(graph) - 1
        answer = []
        def dfs(node,path):
            if node == target:
                answer.append(path)
                return
            for neighbor in graph[node]:
                dfs(neighbor, path + [neighbor])
        dfs(0,[0])
        return answer
