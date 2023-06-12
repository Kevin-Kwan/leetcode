class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new LinkedList<>();
        if (nums.length==0) {
            return answer;
        }
        int a = nums[0];
        int b = nums[0];
        String current = "";
        for (int i = 1; i<nums.length; i++) {
            if (nums[i]==b+1) {
                b = nums[i];
            } else {
                if (a==b) {
                    answer.add(String.valueOf(a));
                } else {
                    answer.add(String.valueOf(a)+"->"+String.valueOf(b));
                }
                a=nums[i];
                b=nums[i];
            }
        }
        if (a==b) {
            answer.add(String.valueOf(a));
        } else {
            answer.add(String.valueOf(a)+"->"+String.valueOf(b));
        }
        return answer;
    }
}
