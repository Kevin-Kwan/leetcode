class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> indexLogger = new HashMap<>();
        int[] answer = new int[nums1.length];
        //Arrays.fill(answer,-1);
        for (int i = 0; i<nums2.length; i++) {
            indexLogger.put(nums2[i],i);
        }
        for (int k = 0; k<nums1.length; k++) {
            answer[k] = -1;
            for (int j = indexLogger.get(nums1[k]); j<nums2.length; j++) {
                if (nums2[j]>nums1[k]) {
                    answer[k] = nums2[j];
                    break;
                }
            }
        }
        return answer;
    }
}
