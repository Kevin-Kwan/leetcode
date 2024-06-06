class Solution:
    def isNStraightHand(self, hand: List[int], groupSize: int) -> bool:
        n = len(hand)
        if n%groupSize!=0:
            return False
        cardCount = Counter(hand)
        hand.sort()
        for i in range(n):
            if cardCount[hand[i]] == 0:
                continue
            for j in range(groupSize):
                currCard = hand[i]+j
                if cardCount[currCard] == 0:
                    return False
                else:
                    cardCount[currCard]-=1
        return True
