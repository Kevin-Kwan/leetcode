class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        deviceCounts = []
        for row in bank:
            numDevices = row.count('1')
            if numDevices > 0:
                deviceCounts.append(numDevices)
        answer = 0
        n = len(deviceCounts)
        if n<2:
            return 0
        answer = 0
        for i in range(len(deviceCounts)-1):
            answer+=deviceCounts[i]*deviceCounts[i+1]
        return answer
