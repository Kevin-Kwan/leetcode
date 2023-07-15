class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0;
        int j = 0;
        int ansPointer = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        while (i<n1 && j<n2) {
            if (nums1[i][0]<nums2[j][0]) {
                i++;
            } else if (nums1[i][0]>nums2[j][0]) {
                j++;
            } else {
                i++;
                j++;
            }
            ansPointer++;
        }
        ansPointer += n1-i + n2-j;
        int[][] answer = new int[ansPointer][2];
        i = 0;
        j = 0;
        ansPointer = 0;
        while (i < n1 && j < n2) {
            if (nums1[i][0]<nums2[j][0]) {
                answer[ansPointer] = nums1[i++];
            } else if (nums1[i][0]>nums2[j][0]) {
                answer[ansPointer] = nums2[j++];
            } else {
                answer[ansPointer][0] = nums1[i][0];
                answer[ansPointer][1] = nums1[i][1]+nums2[j][1];
                i++;
                j++;
            }
            ansPointer++;
        }
        while (i < n1) {
            answer[ansPointer++] = nums1[i++];
        }
        while (j < n2) {
            answer[ansPointer++] = nums2[j++];
        }
        
        return answer;
    }
}
