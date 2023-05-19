/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
const filter = function (arr, fn) {
  const ans = []
  for (let i = 0; i < arr.length; i++) {
    if (fn(arr[i], i)) {
      ans.push(arr[i])
    }
  }
  return ans
}
