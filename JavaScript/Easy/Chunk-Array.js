/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let chunked = [];
    let amount = 0;
    let currChunk = [];
    for (let i = 0; i<arr.length; i++) {
        if (amount == size) {
            amount = 0;
            chunked.push(currChunk);
            currChunk = [];
        }
        currChunk.push(arr[i]);
        amount++;
    }
    if (currChunk.length > 0) {
        chunked.push(currChunk);
    }
    return chunked;
};
