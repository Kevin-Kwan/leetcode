class Solution:
    def missingRolls(self, rolls: List[int], mean: int, n: int) -> List[int]:
        m = len(rolls)
        mAndN = m + n
        total = mAndN * mean
        sumRolls = sum(rolls)
        # print(total-sumRolls)
        totalNeededFromN = total-sumRolls
        if totalNeededFromN < 0 or totalNeededFromN > 6 * n:
            return []
        diceNumNeeded = totalNeededFromN // n
        currSum = diceNumNeeded * n
        if currSum == 0:
            return []
        ans = [diceNumNeeded for _ in range(n)]
        # print(f'{totalNeededFromN}')
        # print(f'{currSum}')
        if currSum == 0:
            return []
        diffNeeded = totalNeededFromN - currSum
        for i in range(n):
            if diffNeeded < 6-ans[i]:
                ans[i]+=diffNeeded
                break
            else:
                diffNeeded -= 6-ans[i]
                ans[i]=6
        return ans
