class Solution:
    def countPoints(self, points: List[List[int]], queries: List[List[int]]) -> List[int]:
        answer = []
        for x, y, r in queries:
            count = 0
            for pointX, pointY in points:
                if ((x-pointX)**2+(y-pointY)**2)**0.5<=r:
                    count+=1
            answer.append(count)
        return answer
