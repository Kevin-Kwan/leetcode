class Solution {
public:
    vector<vector<int>> modifiedMatrix(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        for (int col = 0; col<n; col++) {
            int colMax = 0;
            for (int row = 0; row<m; row++) {
                colMax = max(colMax, matrix[row][col]);
            }
            for (int row = 0; row<m; row++) {
                if (matrix[row][col]==-1) {
                    matrix[row][col]=colMax;
                }
            }
        }
        return matrix;
    }
};
