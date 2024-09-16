class Solution:
    def findMinDifference(self, timePoints: List[str]) -> int:
        timePoints.sort()
        minutes = []
        for time in timePoints:
            hours, mins = map(int, time.split(':'))
            minutes.append(hours * 60 + mins)
        minutes.append(minutes[0] + 24 * 60)
        min_diff = float('inf')
        for i in range(1, len(minutes)):
            min_diff = min(min_diff, minutes[i] - minutes[i - 1])
        
        return min_diff
