class MedianFinder:

    def __init__(self):
        self.storage = []
        self.sorted = False

    def addNum(self, num: int) -> None:
        self.storage.append(num)
        self.sorted = False

    def findMedian(self) -> float:
        if (not self.sorted):
            self.storage.sort()
            self.sorted = True
        idx = len(self.storage)//2
        if (len(self.storage)%2==0):
            return (self.storage[idx]+self.storage[idx-1])/2
        return self.storage[idx]


# Your MedianFinder object will be instantiated and called as such:
# obj = MedianFinder()
# obj.addNum(num)
# param_2 = obj.findMedian()
