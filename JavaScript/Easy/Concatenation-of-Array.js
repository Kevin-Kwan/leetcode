/**
 * @param {number[]} nums
 * @return {number[]}
 */
const getConcatenation = function (nums) {
  const ans = []
  for (let i = 0; i < nums.length; i++) {
    ans[i] = nums[i]
    ans[nums.length + i] = nums[i]
  }
  return ans
}
