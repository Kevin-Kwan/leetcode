class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        rankings = {}
        sortedNumSet = sorted(list(set(arr)))
        for i in range(len(sortedNumSet)):
            rankings[sortedNumSet[i]] = i+1
        for i in range(len(arr)):
            arr[i] = rankings[arr[i]]
        return arr
        
