class SeatManager:

    def __init__(self, n: int):
        self.pq = []
        self.lastSeat = 0

    def reserve(self) -> int:
        if self.pq:
            return heapq.heappop(self.pq)
        self.lastSeat+=1
        return self.lastSeat

    def unreserve(self, seatNumber: int) -> None:
        if seatNumber == self.lastSeat:
            self.lastSeat -= 1
        else:
            heapq.heappush(self.pq,seatNumber)


# Your SeatManager object will be instantiated and called as such:
# obj = SeatManager(n)
# param_1 = obj.reserve()
# obj.unreserve(seatNumber)
