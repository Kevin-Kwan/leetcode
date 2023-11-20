class Solution:
    def garbageCollection(self, garbage: List[str], travel: List[int]) -> int:
        last_index = {'P': 0, 'G': 0, 'M': 0}
        counter = {}
        n = len(garbage)
        # running sum
        travel = list(itertools.accumulate(travel))
        for i in range(n):
            for char in garbage[i]:
                counter[char] = counter.get(char,0) + 1
                last_index[char]=i
        GSum = (counter.get('G') if counter.get('G',0) !=0 else 0)+(travel[last_index['G'] - 1] if last_index['G'] != 0 else 0)
        MSum = (counter.get('M') if counter.get('M',0) !=0 else 0)+(travel[last_index['M'] - 1] if last_index['M'] != 0 else 0)
        PSum = (counter.get('P') if counter.get('P',0) !=0 else 0)+(travel[last_index['P'] - 1] if last_index['P'] != 0 else 0)
        return GSum + MSum + PSum
