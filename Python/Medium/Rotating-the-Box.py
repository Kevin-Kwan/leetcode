class Solution:
    def rotateTheBox(self, box: List[List[str]]) -> List[List[str]]:
        rows = len(box)
        cols = len(box[0])
        ans = [[ '.' for _ in range(rows)] for _ in range(cols)]
        for row in range(rows):
            emptyColPointer = cols-1
            for col in range(cols):
                # pointers for original box
                oldRow = rows-row-1
                oldCol = cols-col-1
                # pointers for new box
                if box[oldRow][oldCol] == '*':
                    emptyColPointer = oldCol - 1
                    ans[oldCol][row] = box[oldRow][oldCol]
                elif box[oldRow][oldCol] == '#':
                    ans[emptyColPointer][row] = '#'
                    emptyColPointer -= 1
        return ans
