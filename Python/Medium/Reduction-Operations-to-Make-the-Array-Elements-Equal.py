class Solution:
    def reductionOperations(self, nums: List[int]) -> int:
        counter = Counter(nums)
        answer = 0
        single_list = list(counter.keys())
        list.sort(single_list)
        for i in range(1,len(single_list)):
            answer+=counter.get(single_list[i])*i
        return answer
