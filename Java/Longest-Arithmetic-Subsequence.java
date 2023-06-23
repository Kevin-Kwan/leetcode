class Solution {
    public int longestArithSeqLength(int[] nums) {
        // Hashmaps to store difference?
        int answer = 2; // base case
        int n = nums.length;
        HashMap<Integer, Integer>[] arrayOfMaps = new HashMap[n];
        for (int i = 0; i<n; i++) {
            arrayOfMaps[i] = new HashMap<Integer,Integer>();
            for (int j = 0; j<i; j++) {
                int difference = nums[i]-nums[j];
                arrayOfMaps[i].put(difference,arrayOfMaps[j].getOrDefault(difference,1)+1);
                answer = Math.max(answer,arrayOfMaps[i].get(difference));
            }
        }
        return answer;
    }
}
