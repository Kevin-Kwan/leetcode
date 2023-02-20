class Solution {
    public int differenceOfSum(int[] nums) {
        int answer = 0;
        for (int i = 0; i<nums.length;i++) {
            answer+=nums[i];
            String temp = String.valueOf(nums[i]);
            for (int j = 0; j<temp.length();j++) {
                answer-=temp.charAt(j)-48;
            }
        }
        return answer;
    }
}
