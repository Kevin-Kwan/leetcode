class SnapshotArray {
    List<TreeMap<Integer, Integer>> data;
    int currentSnapID = 0;
    //Map<Integer, Integer> history;

    public SnapshotArray(int length) {
        data = new LinkedList<>();
        // initialize history
        for (int i = 0; i<length; i++) {
            data.add(new TreeMap<>());
            data.get(i).put(0,0);
        }
    }
    
    public void set(int index, int val) {
        data.get(index).put(currentSnapID,val);
    }
    
    public int snap() {
        return currentSnapID++;
    }
    
    public int get(int index, int snap_id) {
        return data.get(index).floorEntry(snap_id).getValue();
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
