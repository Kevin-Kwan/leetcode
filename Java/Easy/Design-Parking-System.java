class ParkingSystem {
    private int[] parkingLot;

    public ParkingSystem(int big, int medium, int small) {
        this.parkingLot = new int[]{big,medium,small};
    }
    
    public boolean addCar(int carType) {
        if (this.parkingLot[carType-1]!=0) {
            this.parkingLot[carType-1]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
