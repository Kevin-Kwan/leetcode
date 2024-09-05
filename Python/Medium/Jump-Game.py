class Solution:
    def canJump(self, nums: List[int]) -> bool:
        maxJump = 0
        for num in nums:
            if maxJump < 0:
                return False
            if num>=maxJump:
                maxJump = num
            maxJump-=1
        return True
