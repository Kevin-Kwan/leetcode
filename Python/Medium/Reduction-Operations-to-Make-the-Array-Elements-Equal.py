class Solution:
    def reductionOperations(self, nums: List[int]) -> int:
        # list.sort(nums)
        counter = Counter(nums)
        answer = 0
        single_list = list(counter.keys())
        list.sort(single_list)
        next_largest = single_list[0]
        running_ops = 1
        # print(single_list)
        for i in range(1,len(single_list)):
            if single_list[i]>next_largest:
                answer+=counter.get(single_list[i])*running_ops
                running_ops+=1
        return answer
