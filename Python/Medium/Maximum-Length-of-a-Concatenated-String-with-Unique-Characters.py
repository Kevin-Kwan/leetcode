class Solution:
    def maxLength(self, arr):
        answer = 0
        unique_combinations = ['']
        for s in arr:
            # if has duplicate characters
            if len(set(s)) < len(s):
                continue
            for combination in unique_combinations:
                tempS = combination + s
                if len(set(tempS)) == len(tempS):
                    unique_combinations.append(tempS)
                    answer = max(answer, len(tempS))
        return answer
