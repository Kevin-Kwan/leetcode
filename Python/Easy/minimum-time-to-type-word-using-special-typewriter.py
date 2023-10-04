class Solution:
    def minTimeToType(self, word: str) -> int:
        time = len(word)  # typing each character takes 1 second
        prev = 'a'  # initial position of the typewriter
        for char in word:
            clockwise = abs(ord(char) - ord(prev))
            counterclockwise = 26 - clockwise
            time += min(clockwise, counterclockwise)
            prev = char
        return time
