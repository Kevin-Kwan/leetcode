class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        starts = set(row[0] for row in paths)
        for path in paths:
            if path[1] not in starts:
                return path[1]
