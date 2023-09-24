class Solution:
    def champagneTower(self, poured: int, query_row: int, query_glass: int) -> float:
        # 1 indexed
        tower = [[0]* i for i in range(1,query_row+2)]
        tower[0][0] = poured
        for row in range(query_row):
            for glass in range(len(tower[row])):
                excess = (tower[row][glass]-1)/2.0
                # if negative or 0, no excess
                if excess > 0:
                    # propagate to below two
                    tower[row+1][glass]+=excess
                    tower[row+1][glass+1]+=excess
        return min(1.0,tower[query_row][query_glass])
        
