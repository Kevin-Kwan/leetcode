class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        stack = []
        moves = []
        targetPointer = 0
        for i in range(1,n+1):
            if stack == target:
                return moves
            moves.append("Push")
            if i!=target[targetPointer]:
                moves.append("Pop")
            else:
                stack.append(i)
                targetPointer+=1
        return moves
