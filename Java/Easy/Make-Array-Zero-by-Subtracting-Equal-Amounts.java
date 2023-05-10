class Solution {
    public int minimumOperations(int[] nums) {
        int answer = 0;
        int[] desired = new int[nums.length]; 
        while (!Arrays.equals(nums,desired)) {
            answer++;
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i<nums.length; i++) {
                if (smallest > nums[i] && nums[i] != 0) {
                    smallest = nums[i];
                }
            }
            for (int j = 0; j<nums.length; j++) {
                if (nums[j]!=0) {
                    nums[j]-=smallest;
                }
            }
        }
        return answer;
    }
    
}
