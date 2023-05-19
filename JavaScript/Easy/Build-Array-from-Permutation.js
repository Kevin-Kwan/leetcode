/**
 * @param {number[]} nums
 * @return {number[]}
 */
const buildArray = function (nums) {
  const ans = Array(nums.length)
  for (let i = 0; i < nums.length; i++) {
    ans[i] = nums[nums[i]]
  }
  return ans
}
