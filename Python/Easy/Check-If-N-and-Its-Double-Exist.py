class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        seen = set()
        n = len(arr)
        for num in arr:
            if num*2 in seen or num/2 in seen:
                return True
            seen.add(num)
        return False
