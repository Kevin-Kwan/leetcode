# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def splitListToParts(self, head: Optional[ListNode], k: int) -> List[Optional[ListNode]]:
        # Count the length of the linked list
        curr, length = head, 0
        while curr:
            curr, length = curr.next, length + 1
        # Determine the length of each chunk
        chunk_size, longer_chunks = length // k, length % k
        res = [chunk_size + 1 for _ in range(longer_chunks)] + [chunk_size for _ in range(k - longer_chunks)]
        # Split up the list
        prev, curr = None, head
        # print(res)
        for index, num in enumerate(res):
            # perform split
            if prev:
                prev.next = None
            res[index] = curr
            for i in range(num):
                prev, curr = curr, curr.next
        return res
