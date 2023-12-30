class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        counter = {}
        n = 0
        for row in range(0,len(grid)):
            for col in range(0,len(grid[row])):
                counter[grid[row][col]]=counter.get(grid[row][col],0)+1
                n+=1
        missing = []
        repeated = []
        for i in range(1,n+1):
            if counter.get(i,0)==0:
                missing.append(i)
            if counter.get(i,0)>1:
                repeated.append(i)
        return repeated+missing
        
