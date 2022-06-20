class Cell {
    int id;
    int inTime;
    int outTime; 
    String inStation;
    String outStation; 
        
    public Cell (int id, String inStation, int inTime) {
        this.id = id; 
        this.inStation = inStation; 
        this.inTime = inTime;
        outStation = "";
        outTime = -1;
    }
}
class UndergroundSystem {
    HashMap<Integer, Cell> map = new HashMap<>();
    
    public UndergroundSystem() { }
    
    public void checkIn(int id, String stationName, int t) {
        map.put(id, new Cell(id, stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Cell curr = map.get(id); 
        curr.outStation = stationName; 
        curr.outTime = t; 
    }
    
    public double getAverageTime(String startStation, String endStation) {
        int sum = 0, count = 0;
        for(Cell cell: map.values()) {
            if(cell.inStation.equals(startStation) && cell.outStation.equals(endStation)) {
                sum += (cell.outTime - cell.inTime);
                count++;
            }
        }
        return sum / count; 
    }
}
