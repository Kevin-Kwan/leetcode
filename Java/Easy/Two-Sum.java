import java.util.*;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] indexArray = new int[2];
    int sum = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      sum = 0;
      sum = nums[i];
      for (int j = 0; j < nums.length; j++) {
        sum = nums[i];
        if (i == j) {
        } else {
          sum += nums[j];
          if (sum == target) {
            indexArray[0] = i;
            indexArray[1] = j;
            return indexArray;
          }
        }
      }
    }
    return indexArray;
  }
}
