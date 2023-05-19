class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> factors = new LinkedList<>();
        for (int i = 1; i<=n; i++) {
            if (n%i==0) {
                factors.add(i);
            }
            if (factors.size()==k) {
                return factors.get(k-1);
            }
        }
        return -1;
    }
}
