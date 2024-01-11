class Solution:
    def answerQueries(self, nums: List[int], queries: List[int]) -> List[int]:
        nums.sort()
        answer = []
        for query in queries:
            counter = 0
            runningSum = 0
            for num in nums:
                if runningSum+num>query:
                    break
                runningSum+=num
                counter+=1
            answer.append(counter)
        return answer
