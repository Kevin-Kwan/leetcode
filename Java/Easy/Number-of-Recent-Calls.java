class RecentCounter {
    List<Integer> requests;

    public RecentCounter() {
        this.requests = new ArrayList<>();
    }
    
    public int ping(int t) {
        requests.add(t);
        int index = Collections.binarySearch(requests, t - 3000);
        if (index < 0) { index = ~index; } // use the index of the ceiling of t - 3000 if not in list
        return requests.size()-index;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
