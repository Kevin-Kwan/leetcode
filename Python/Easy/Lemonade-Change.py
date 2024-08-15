class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        billCount = Counter()
        for bill in bills:
            if bill == 5:
                billCount[5] += 1
            elif (bill == 10 and billCount[5]>=1):
                billCount[10] +=1
                billCount[5] -= 1
            elif bill == 20:
                if billCount[10] >= 1 and billCount[5] >= 1:
                    billCount[20] += 1
                    billCount[10] -= 1
                    billCount[5] -= 1
                elif billCount[5] >= 3:
                    billCount[20] += 1
                    billCount[5] -= 3
                else:
                    return False
            else:
                return False
        return True
