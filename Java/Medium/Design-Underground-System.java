class UndergroundSystem {
    private Map<Integer, checkInInfo> checkIns;
    private Map<String, travelInfo> travelTimes;
    public UndergroundSystem() {
        checkIns = new HashMap<>();
        travelTimes = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id,new checkInInfo(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        checkInInfo temp = checkIns.remove(id);
        String trip = temp.stationName+"-"+stationName;
        int travelTime = t-temp.time;
        if (travelTimes.containsKey(trip)) {
            travelInfo tempTravelInfo = travelTimes.get(trip);
            tempTravelInfo.totalTime+=travelTime;
            tempTravelInfo.numTravels++;
        } else {
            travelTimes.put(trip,new travelInfo(travelTime,1));
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String trip = startStation+"-"+endStation;
        travelInfo tempTravelInfo = travelTimes.get(trip);
        return (double)tempTravelInfo.totalTime/tempTravelInfo.numTravels;
    }

    private class checkInInfo {
        String stationName;
        int time;
        public checkInInfo(String stationName, int t) {
            this.stationName = stationName;
            this.time = t;
        }
    }

    private class travelInfo {
        int totalTime;
        int numTravels;
        public travelInfo(int totalTime, int numTravels) {
            this.totalTime = totalTime;
            this.numTravels = numTravels;
        }

    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
