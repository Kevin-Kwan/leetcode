class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        lowerBound = len(nums)//3
        answer = []
        count = {}
        for num in nums:
            count[num]=count.get(num,0)+1
        for key, value in count.items():
            if value>lowerBound:
                answer.append(key)
        return answer
