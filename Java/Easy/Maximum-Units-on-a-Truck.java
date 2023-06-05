class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int maxUnits = 0;
        for (int[] box:boxTypes) {
            if (box[0]<truckSize) {
                truckSize-=box[0];
                maxUnits += box[0] * box[1];
            } else {
                return maxUnits + truckSize*box[1];
            }
        }
        return maxUnits;
    }
}
