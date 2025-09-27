class Solution {
public:
    double largestTriangleArea(vector<vector<int>>& points) {
        double maxArea = 0;
        for (int i = 0; i<points.size(); ++i) {
            for (int j = i + 1; j<points.size(); ++j) {
                for (int k = j + 1; k<points.size(); ++k) {
                    // check if all points are on the same axis, then area will be 0
                    if ((points[i][0]==points[j][0] && points[j][0]==points[k][0])||(points[i][1]==points[j][1] && points[j][1]==points[k][1])) {
                        continue;
                    }
                    double area = 0.5*((points[j][0]-points[i][0])*(points[k][1]-points[i][1])-(points[j][1]-points[i][1])*(points[k][0]-points[i][0]));
                    maxArea = max(maxArea, abs(area));
                }
            }
        }
        return maxArea;
    }
};
