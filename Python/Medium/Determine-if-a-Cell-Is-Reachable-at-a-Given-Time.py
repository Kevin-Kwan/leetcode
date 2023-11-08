class Solution:
    def isReachableAtTime(self, sx: int, sy: int, fx: int, fy: int, t: int) -> bool:
        if (sx == fx and sy == fy):
            if t==1:
                return False
            return True
        diffY = abs(fy-sy)
        diffX = abs(fx-sx)
        if t>=max(diffY,diffX):
            return True
        return False
