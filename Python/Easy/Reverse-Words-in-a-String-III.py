class Solution:
    def reverseWords(self, s: str) -> str:
        sepArr = s.split(' ')
        print(sepArr)
        answer = ""
        for i in range(len(sepArr)):
            answer+= sepArr[i][::-1]
            if (i!=len(sepArr)-1):
                answer+=" "
        return answer
