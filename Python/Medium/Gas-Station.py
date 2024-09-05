class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        n = len(gas)
        gasSum = 0
        costSum = 0
        gasTank = 0
        start = 0
        for i in range(n):
            gasSum+=gas[i]
            costSum+=cost[i]
            gasTank += gas[i]-cost[i]
            if gasTank < 0:
                gasTank = 0
                start = i+1
        if gasSum<costSum:
            return -1
        return start
