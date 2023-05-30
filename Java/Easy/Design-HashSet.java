class MyHashSet {
    List<Integer> storage;
    public MyHashSet() {
        this.storage = new ArrayList<>();
    }
    
    public void add(int key) {
        if (!storage.contains(key)) {
            storage.add(key);
        }
    }
    
    public void remove(int key) {
        for (int i = 0; i<storage.size(); i++) {
            if (storage.get(i)==key) {
                storage.remove(i);
            }
        }
    }
    
    public boolean contains(int key) {
        return storage.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
