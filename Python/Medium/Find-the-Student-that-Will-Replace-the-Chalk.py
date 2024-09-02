class Solution:
    def chalkReplacer(self, chalk: List[int], k: int) -> int:
        chalkSum = sum(chalk)
        remaining = k % chalkSum
        print(remaining)
        for i in range(len(chalk)):
            if chalk[i] > remaining:
                return i
            remaining -= chalk[i]
        return 0
