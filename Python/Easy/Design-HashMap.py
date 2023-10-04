class MyHashMap:
    def __init__(self):
        self.data = [None] * 1000001
    def put(self, key: int, value: int) -> None:
        self.data[key] = value
    def get(self, key: int) -> int:
        if self.data[key] == None:
            return -1
        return self.data[key]
    def remove(self, key: int) -> None:
        self.data[key] = None


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)
