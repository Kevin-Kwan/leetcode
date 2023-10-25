# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        num1 = 0
        inc = 1
        while l1 != None:
            num1 += l1.val*inc
            inc *= 10
            l1 = l1.next
        print(num1)
        num2 = 0
        inc = 1
        while l2 != None:
            num1 += l2.val*inc
            inc *= 10
            l2 = l2.next
        numSum = num1+num2
        stringNumSum = str(numSum)
        head = ListNode()
        temp = head
        n = len(stringNumSum)
        temp.val = int(stringNumSum[n-1])
        for i in range(n-2,-1,-1):
            temp.next = ListNode()
            temp = temp.next
            temp.val = int(stringNumSum[i])
        return head
