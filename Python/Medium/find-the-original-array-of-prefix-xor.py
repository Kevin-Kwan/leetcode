class Solution:
    def findArray(self, pref: List[int]) -> List[int]:
        runningXor = pref[0]
        answer = [pref[0]]
        for i in range(1,len(pref)):
            answer.append(runningXor ^ pref[i])
            runningXor = runningXor ^ answer[i]
        return answer
