class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] howMany = new int[nums.length];
        for (int i=0;i<nums.length;i++)
        {
             for (int j=0;j<nums.length;j++)
             {
                 if(nums[j]<nums[i])
                    {
                        howMany[i]++;
                    }
             }
        }
        return howMany;
    }
}
