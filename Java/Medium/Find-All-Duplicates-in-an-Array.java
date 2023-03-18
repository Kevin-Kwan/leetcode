class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> dictionary = new HashMap<>();
        List<Integer> answer = new LinkedList<>();
        for (int i = 0; i<nums.length; i++) {
            if (dictionary.getOrDefault(nums[i],0)+1==2) {
                answer.add(nums[i]);
            }
            dictionary.put(nums[i],dictionary.getOrDefault(nums[i],0)+1);
        }
        return answer;
    }
}
