class Solution {
    public int longestSubarray(int[] nums) {
        List<Integer> temp = new LinkedList<>();
        int count = 0;
        for (int i = 0; i<nums.length;i++) {
            if (nums[i]==0) {
                if (count!=0) {
                    temp.add(count);
                    count=0;
                } else {
                    temp.add(count);
                }
            } else {
                count++;
            }
        }
        if (count!=0) {
            temp.add(count);
        }
        if (temp.size()==1) {
            return temp.get(0)-1;
        }
        int max = 0;
        for (int i = 0; i<temp.size()-1; i++) {
            int calc = temp.get(i)+temp.get(i+1);
            if (calc>max) {
                max = calc;
            }
        }
        return max;

    }
}
