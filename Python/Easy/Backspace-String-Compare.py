class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        stackS=[]
        for char in s:
            if char=='#':
                if len(stackS)>0:
                    stackS.pop()
            else:
                stackS.append(char)
        stackT=[]
        for char in t:
            if char=='#':
                if len(stackT)>0:
                    stackT.pop()
            else:
                stackT.append(char)
        return stackS==stackT
