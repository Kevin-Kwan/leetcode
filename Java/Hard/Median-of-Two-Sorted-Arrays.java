class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] merged = new int[nums1.length + nums2.length];
    int k = 0;
    int i = 0;
    int j = 0;
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        merged[k++] = nums1[i++];
      } else {
        merged[k++] = nums2[j++];
      }
    }
    while (i < nums1.length) {
      merged[k++] = nums1[i++];
    }
    while (j < nums2.length) {
      merged[k++] = nums2[j++];
    }
    if (merged.length % 2 == 0) {
      return (merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2.0;
    } else {
      return merged[merged.length / 2];
    }
  }
}
