class Solution:
    def finalPositionOfSnake(self, n: int, commands: List[str]) -> int:
        x = 0
        y = 0
        for command in commands:
            if command == "RIGHT":
                x+=1
            elif command == "LEFT":
                x-=1
            elif command == "UP":
                y-=1
            else:
                y+=1
        return y*n+x
