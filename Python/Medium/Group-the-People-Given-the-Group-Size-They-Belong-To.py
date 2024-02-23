class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        dict = defaultdict(list)
        n = len(groupSizes)
        for i in range(n):
            dict[groupSizes[i]].append(i)
        answer = []
        for groupSize, people in dict.items():
            for i in range(0,len(people),groupSize):
                answer.append(people[i:i+groupSize])
        return answer
