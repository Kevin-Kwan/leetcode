class Solution {
    public int findCenter(int[][] edges) {
        int value = edges[0][0];
        if (value == edges[1][0] || value == edges[1][1])
        {
            return value;
        }
        return edges[0][1];
    }
}
// pretty sure that this is a bruteforce way to do this problem but it works lol
