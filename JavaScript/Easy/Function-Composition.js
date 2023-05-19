/**
 * @param {Function[]} functions
 * @return {Function}
 */
const compose = function (functions) {
  return function (x) {
    if (functions.length == 0) {
      return x
    }
    let tempX = x
    for (const func of functions.reverse()) {
      tempX = func(tempX)
    }
    return tempX
  }
}

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */
