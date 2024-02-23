class Solution:
    def answerQueries(self, nums: List[int], queries: List[int]) -> List[int]:
        nums.sort()
        n = len(nums)
        answer = []
        self.runningSum = []
        self.runningSum.append(nums[0])
        for i in range(1,n):
            self.runningSum.append(self.runningSum[i-1]+nums[i])
        for query in queries:
            index = self.binarySearch(query)
            answer.append(index)
        return answer
        
    def binarySearch(self, query):
        left = 0
        right = len(self.runningSum) - 1
        while left < right:
            mid = (left + right + 1) // 2
            if self.runningSum[mid] <= query:
                if self.runningSum[mid] == query:
                    return mid + 1
                left = mid
            else:
                right = mid - 1
        if self.runningSum[right] > query:
            return 0
        else:
            return right + 1
