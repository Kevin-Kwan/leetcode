# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:
        numsSet = set(nums)
        prevPointer = None
        pointer = head
        ansHead = None
        while pointer is not None:
            if pointer.val not in numsSet:
                if ansHead is None:
                    ansHead = pointer
                prevPointer = pointer
            else:
                if prevPointer is not None:
                    prevPointer.next = pointer.next
            pointer = pointer.next
        return ansHead
