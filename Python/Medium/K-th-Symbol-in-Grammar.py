class Solution:
    def kthGrammar(self, n: int, k: int) -> int:
        isSame = True
        numElements =  1 << (n-1)
        while numElements!=1:
            numElements //=2
            if k>numElements:
                k-=numElements
                isSame = not isSame
        if isSame:
            return 0
        else:
            return 1
