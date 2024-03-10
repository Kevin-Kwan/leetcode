class Solution {
public:
    vector<vector<int>> modifiedMatrix(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        int maxes[n];
        for (int col = 0; col<n; col++) {
            int max = 0;
            for (int row = 0; row<m; row++) {
                if (matrix[row][col]>max) {
                    max = matrix[row][col];
                }
            }
            maxes[col] = max;
            cout << max;
        }
        for (int col = 0; col<n; col++) {
            for (int row = 0; row<m; row++) {
                if (matrix[row][col]==-1) {
                    matrix[row][col]=maxes[col];
                }
            }
        }
        return matrix;
    }
};
