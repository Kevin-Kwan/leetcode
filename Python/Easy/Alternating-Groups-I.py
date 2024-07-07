class Solution:
    def numberOfAlternatingGroups(self, colors: List[int]) -> int:
        count = 0
        n = len(colors)
        for i in range(1,n-1):
            if colors[i]!=colors[i-1] and colors[i]!=colors[i+1]:
                count+=1
        return count + (colors[0]!=colors[1] and colors[0]!=colors[-1]) + (colors[-1]!=colors[-2] and colors[-1]!=colors[0])
