class Solution:
    def findWinners(self, matches: List[List[int]]) -> List[List[int]]:
        counts = {}
        zeros = []
        ones = []
        for match in matches:
            counts[match[1]]=counts.get(match[1],0)+1
            if counts.get(match[0],0)==0:
                counts[match[0]]=0
        for key, value in counts.items():
            if value == 1:
                ones.append(key)
            elif value == 0:
                zeros.append(key)
        return [sorted(zeros),sorted(ones)]
        
        
