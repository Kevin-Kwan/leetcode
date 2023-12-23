class Solution:
    def isPathCrossing(self, path: str) -> bool:
        x, y = 0, 0
        visited = {(0, 0)}
        for dir in path:
            match dir:
                case 'N':
                    y+=1
                case 'S':
                    y-=1
                case 'E':
                    x+=1
                case 'W':
                    x-=1
            if (x, y) in visited:
                return True
            visited.add((x, y))
        return False
